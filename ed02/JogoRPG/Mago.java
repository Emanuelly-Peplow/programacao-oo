/**
 * Personagem Mago: Ataque mágico forte, defesa fraca
 * Habilidade especial: Bola de Fogo (ataque em área)
 */
public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 100, 30);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lançou Bola de Fogo e causou dano em área");
    }
}
