/**
 * Classe que representa um visitante com acesso limitado
 */
public class Visitante extends Usuario {

    /**
     * Construtor da classe
     */
    public Visitante(String login, String senha) {
        super(login, senha);
    }

    /**
     * Exibe mensagem de acesso restrito
     */
    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}
