/**
 * Representa um contato do tipo Pessoa Física
 */
public class PessoaFisica extends ContatoBase {
    private String cpf;

    /**
     * Construtor
     */
    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        this.cpf = cpf;
    }

    /**
     * Retorna o CPF do contato
     */
    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }
}
