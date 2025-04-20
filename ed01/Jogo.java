import java.util.Random;

/**
 * Controla a partida do jogo de adivinhação, gerando o número secreto e processando as tentativas
 */
class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    /**
     * Inicializa uma nova partida para o jogador especificado
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    /**
     * Processa uma tentativa do jogador
     */
    public String jogar(int tentativa) {
        jogador.incrementartentativas();

        if (tentativa == numeroSecreto) {
            int pontos = Math.max(10, 100 - (jogador.getTentativas() * 9));
            jogador.atualizarpontuacao(pontos);
            return "acertou";
        } else if (tentativa < numeroSecreto) {
            return "maior";
        } else {
            return "menor";
        }
    }

    /**
     * Obtém o número secreto gerado para esta partida
     */
    public int getNumeroSecreto() {
        return numeroSecreto;
    }
}