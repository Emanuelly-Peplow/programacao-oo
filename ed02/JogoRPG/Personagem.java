/**
 * Classe base para os personagens do jogo
 * Define atributos comuns e comportamentos básicos
 */
public class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    /**
     * Realiza um ataque contra outro personagem
     */
    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase);
        System.out.println(nome + " atacou " + inimigo.nome + " causando " + ataqueBase + " de dano");
    }

    /**
     * Reduz o HP do personagem com base no dano recebido
     */
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano");
    }

    /**
     * Executa a habilidade especial do personagem
     */
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou uma habilidade especial genérica");
    }

    /**
     * Exibe o status atual do personagem
     */
    public void status() {
        System.out.println("Personagem: " + nome + " | HP: " + hp + " | Ataque Base: " + ataqueBase);
    }

}
