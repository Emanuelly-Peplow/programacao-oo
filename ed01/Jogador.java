/**
 * Representa um jogador no jogo de adivinhação, armazenando nome, número de tentativas e pontuação
 */
class Jogador {
    private String nome;
    private int tentativas;
    private int pontuacao;

    /**
     * Constrói um novo jogador com o nome especificado
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    /**
     * Obtém o nome do jogador
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define um novo nome para o jogador
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o número de tentativas realizadas
     */
    public int getTentativas() {
        return tentativas;
    }

    /**
     * Define o número de tentativas
     */
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    /**
     * Obtém a pontuação atual do jogador
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * Define a pontuação do jogador
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * Incrementa em 1 o número de tentativas do jogador
     */
    public void incrementartentativas() {
        this.tentativas++;
    }

    /**
     * Adiciona pontos à pontuação total do jogador
     */
    public void atualizarpontuacao(int valor) {
        this.pontuacao += valor;
    }
}