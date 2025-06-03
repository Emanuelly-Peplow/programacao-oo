/**
 * Interface para autenticação de usuários
 */
public interface Autenticavel {
    /**
     * Verifica se a senha fornecida é válida
     */
    boolean autenticar(String senha);
}
