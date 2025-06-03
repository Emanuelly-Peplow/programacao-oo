/**
 * Classe que representa um gráfico estatístico
 */
public class GraficoEstatistico implements Imprimivel {
    private String titulo;
    private String tipoGrafico;

    /**
     * Construtor da classe
     */
    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    /**
     * Imprime o tipo do gráfico e o título em caixa alta
     */
    @Override
    public void imprimir() {
        System.out.println("Gráfico do tipo: " + tipoGrafico.toUpperCase());
        System.out.println("Título: " + titulo.toUpperCase());
        System.out.println();
    }
}
