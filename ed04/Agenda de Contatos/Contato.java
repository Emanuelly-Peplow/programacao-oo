/**
 * Interface que define os métodos obrigatórios para um contato
 */
public interface Contato {
    /**
     * Retorna o nome do contato
     */
    String getNome();

    /**
     * Retorna o telefone do contato
     */
    String getTelefone();

    /**
     * Retorna o e-mail do contato
     */
    String getEmail();
}
