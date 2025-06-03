/**
 * Classe que representa um relatório em PDF
 */
public class RelatorioPDF implements Imprimivel {
    private String autor;
    private int numeroPaginas;

    /**
     * Construtor da classe
     */
    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Imprime o nome do autor e total de páginas
     */
    @Override
    public void imprimir() {
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + numeroPaginas);
        System.out.println();
    }
}
