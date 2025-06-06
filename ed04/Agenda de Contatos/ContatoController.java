import java.util.ArrayList;
import java.util.List;

/**
 * Controlador que gerencia a lista de contatos
 */
public class ContatoController {
    private List<Contato> contatos = new ArrayList<>();

    /**
     * Adiciona um contato se for válido e único
     */
    public void adicionar(Contato contato) {
        if (contato.getNome() == null || contato.getNome().length() < 3) {
            System.out.println("Nome inválido.");
            return;
        }

        String id = obterIdentificador(contato);
        if (existeContato(id)) {
            System.out.println("Contato com este CPF/CNPJ já existe.");
            return;
        }

        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    /**
     * Remove um contato com base em CPF ou CNPJ
     */
    public void remover(String id) {
        Contato encontrado = null;
        for (Contato c : contatos) {
            if (obterIdentificador(c).equals(id)) {
                encontrado = c;
                break;
            }
        }

        if (encontrado != null) {
            contatos.remove(encontrado);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    /**
     * Lista todos os contatos
     */
    public List<Contato> listar() {
        return contatos;
    }

    private boolean existeContato(String id) {
        return contatos.stream().anyMatch(c -> obterIdentificador(c).equals(id));
    }

    private String obterIdentificador(Contato contato) {
        if (contato instanceof PessoaFisica)
            return ((PessoaFisica) contato).getCpf();
        else if (contato instanceof PessoaJuridica)
            return ((PessoaJuridica) contato).getCnpj();
        return "";
    }
}
