/**
 * Classe que representa um administrador do sistema
 */
public class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {

    /**
     * Construtor da classe
     */
    public Administrador(String login, String senha) {
        super(login, senha);
    }

    /**
     * Autentica o administrador se a senha for exata
     */
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    /**
     * Altera a senha do administrador
     */
    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    /**
     * Bloqueia o administrador
     */
    @Override
    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    /**
     * Registra uma operação no log
     */
    @Override
    public void registrarLog(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
}
