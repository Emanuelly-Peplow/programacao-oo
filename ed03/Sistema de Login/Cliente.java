/**
 * Classe que representa um cliente autenticável
 */
public class Cliente extends Usuario implements Autenticavel {

    /**
     * Construtor da classe
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    /**
     * Autentica apenas se a senha tiver mais de 6 caracteres e for igual à armazenada
     */
    @Override
    public boolean autenticar(String senha) {
        return senha.length() > 6 && this.senha.equals(senha);
    }
}
