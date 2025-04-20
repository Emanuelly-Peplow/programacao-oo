import java.util.Scanner;

/**
 * Classe principal que inicia e controla o fluxo do jogo
 */
public class Main {
    private static Placar placar = new Placar();
    private static Scanner teclado = new Scanner(System.in);

    /**
     * Ponto de entrada principal do programa
     */
    public static void main(String[] args) {
        System.out.println("ADIVINHE O NÚMERO SECRETO");

        boolean continuar = true;
        while (continuar) {
            jogarPartida();
            System.out.print("\nJogar novamente? (s/n): ");
            String resposta = teclado.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        placar.mostrarranking();
        teclado.close();
    }

    /**
     * Executa uma partida completa do jogo
     */
    private static void jogarPartida() {
        System.out.print("\nDigite seu nome: ");
        String nomeJogador = teclado.next();

        Jogador jogador = new Jogador(nomeJogador);
        Jogo jogo = new Jogo(jogador);

        System.out.println("\nTente adivinhar o número secreto entre 1 e 100.");

        boolean acertou = false;
        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Digite um número válido.");
                teclado.next();
                System.out.print("Digite seu palpite: ");
            }
            int palpite = teclado.nextInt();

            String resultado = jogo.jogar(palpite);
            switch (resultado) {
                case "acertou":
                    System.out.printf("\nParabéns %s! Você acertou o número %d em %d tentativas.%n",
                            jogador.getNome(), jogo.getNumeroSecreto(), jogador.getTentativas());
                    System.out.printf("Pontuação: %d pontos%n", jogador.getPontuacao());
                    acertou = true;
                    break;
                case "maior":
                    System.out.println("O número secreto é maior que " + palpite);
                    break;
                case "menor":
                    System.out.println("O número secreto é menor que " + palpite);
                    break;
            }
        }

        placar.adicionarjogador(jogador);
    }
}