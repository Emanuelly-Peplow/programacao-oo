/**
 * Classe principal do jogo
 * Cria e testa os personagens com ataques e habilidades
 */
public class MainRPG {
    public static void main(String[] args) {
        System.out.println();
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");
        System.out.println();

        System.out.println("\n- Status Inicial -");
        g.status();
        m.status();
        a.status();
        System.out.println();

        System.out.println("\n- Combate -");
        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();
        System.out.println();

        System.out.println("\n- Status Final -");
        g.status();
        m.status();
        a.status();
        System.out.println();
    }
}
