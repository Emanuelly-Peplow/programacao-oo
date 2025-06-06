/**
 * Classe principal que inicializa a aplicação
 */
public class Main {
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView();
        view.exibirMenu(controller);
    }
}

