/**
 * Personagem Guerreiro: Forte fisicamente, boa defesa
 * Habilidade especial: Golpe Duplo (ataque duplo)
 */
public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 150, 20);
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        super.defender(danoReduzido);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Golpe Duplo");
        System.out.println("Causou " + (ataqueBase * 2) + " de dano");
    }
}
