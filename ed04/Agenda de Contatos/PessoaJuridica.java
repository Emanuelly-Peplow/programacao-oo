/**
 * Representa um contato do tipo Pessoa Jurídica
 */
public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    /**
     * Construtor
     */
    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
    }

    /**
     * Retorna o CNPJ do contato
     */
    public String getCnpj() { return cnpj; }

    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
}
