/**
 * Personagem Arqueiro: Ataque médio com chance de crítico
 * Habilidade especial: Chuva de Flechas (3 ataques)
 */
public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome, 120, 15);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println();
        System.out.println(nome + " usou Chuva de Flechas");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Flecha " + i + ": causou " + ataqueBase + " de dano");
        }
    }
}
