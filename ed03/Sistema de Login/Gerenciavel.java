/**
 * Interface para funcionalidades administrativas
 */
public interface Gerenciavel {
    /**
     * Altera a senha do usuário
     */
    void alterarSenha(String novaSenha);

    /**
     * Bloqueia o usuário
     */
    void bloquearUsuario();
}
