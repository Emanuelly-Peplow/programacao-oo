import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável por interações com o usuário
 */
public class ContatoView {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Exibe o menu principal da aplicação
     */
    public void exibirMenu(ContatoController controller) {
        int opcao;
        do {
            System.out.println("\n- AGENDA DE CONTATOS -");
            System.out.println("1 - Adicionar Pessoa Física");
            System.out.println("2 - Adicionar Pessoa Jurídica");
            System.out.println("3 - Listar Contatos");
            System.out.println("4 - Remover Contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> adicionarPessoaFisica(controller);
                case 2 -> adicionarPessoaJuridica(controller);
                case 3 -> mostrarContatos(controller.listar());
                case 4 -> removerContato(controller);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private void adicionarPessoaFisica(ContatoController controller) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("CPF (11 dígitos): ");
        String cpf = scanner.nextLine();

        if (cpf.length() != 11 || !cpf.matches("\\d+")) {
            System.out.println("CPF inválido.");
            return;
        }

        PessoaFisica pf = new PessoaFisica(nome, telefone, email, cpf);
        controller.adicionar(pf);
    }

    private void adicionarPessoaJuridica(ContatoController controller) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("CNPJ (14 dígitos): ");
        String cnpj = scanner.nextLine();

        if (cnpj.length() != 14 || !cnpj.matches("\\d+")) {
            System.out.println("CNPJ inválido.");
            return;
        }

        PessoaJuridica pj = new PessoaJuridica(nome, telefone, email, cnpj);
        controller.adicionar(pj);
    }

    private void removerContato(ContatoController controller) {
        System.out.print("Digite o CPF ou CNPJ do contato a remover: ");
        String id = scanner.nextLine();
        controller.remover(id);
    }

    /**
     * Mostra a lista de contatos formatada
     */
    public void mostrarContatos(List<Contato> contatos) {
        System.out.println("\n- LISTA DE CONTATOS -");
        for (Contato c : contatos) {
            if (c instanceof PessoaFisica pf) {
                System.out.printf("\n[Física]\n  Nome: %s\n " + " Telefone: %s\n " + " Email: %s\n " + " CPF: %s\n",
                        pf.getNome(), pf.getTelefone(), pf.getEmail(), pf.getCpf());
            } else if (c instanceof PessoaJuridica pj) {
                System.out.printf("\n[Jurídica]\n  Nome: %s\n " + " Telefone: %s\n " + " Email: %s\n " + " CNPJ: %s\n",
                        pj.getNome(), pj.getTelefone(), pj.getEmail(), pj.getCnpj());
            }
        }
    }
}
