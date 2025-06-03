/**
 * Classe que representa uma imagem digital
 */
public class ImagemDigital implements Imprimivel {
    private String nomeArquivo;
    private String resolucao;

    /**
     * Construtor da classe
     */
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    /**
     * Imprime o nome do arquivo e a resolução
     */
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Resolução: " + resolucao);
        System.out.println();
    }
}
