/**
 * Classe que representa um documento de texto
 */
public class DocumentoTexto implements Imprimivel {
    private String titulo;
    private String conteudo;

    /**
     * Construtor da classe
     */
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    /**
     * Imprime o título em caixa alta e o conteúdo
     */
    @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo);
        System.out.println();
    }
}
