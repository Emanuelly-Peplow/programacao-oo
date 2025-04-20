import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Gerencia o ranking de jogadores, armazenando e exibindo as pontuações
 */
class Placar {
    private ArrayList<Jogador> ranking;

    /**
     * Constrói um novo placar vazio
     */
    public Placar() {
        this.ranking = new ArrayList<>();
    }

    /**
     * Adiciona um jogador ao ranking ou atualiza sua pontuação se já existir
     */
    public void adicionarjogador(Jogador j) {
        for (Jogador jogadorExistente : ranking) {
            if (jogadorExistente.getNome().equalsIgnoreCase(j.getNome())) {
                if (j.getPontuacao() > jogadorExistente.getPontuacao()) {
                    jogadorExistente.setPontuacao(j.getPontuacao());
                    jogadorExistente.setTentativas(j.getTentativas());
                }
                ordenarranking();
                return;
            }
        }
        ranking.add(j);
        ordenarranking();
    }

    /**
     * Exibe o ranking de jogadores ordenado por pontuação
     */
    public void mostrarranking() {
        System.out.println("\nRANKING:");
        if (ranking.isEmpty()) {
            System.out.println("Nenhum jogador registrado ainda");
        } else {
            for (int i = 0; i < ranking.size(); i++) {
                Jogador j = ranking.get(i);
                System.out.printf("%dº lugar - %s: %d pontos (%d tentativas)%n",
                        i+1, j.getNome(), j.getPontuacao(), j.getTentativas());
            }
        }
    }

    /**
     * Ordena o ranking por pontuação em ordem decrescente
     */
    private void ordenarranking() {
        Collections.sort(ranking, new Comparator<Jogador>() {
            @Override
            public int compare(Jogador j1, Jogador j2) {
                return Integer.compare(j2.getPontuacao(), j1.getPontuacao());
            }
        });
    }
}