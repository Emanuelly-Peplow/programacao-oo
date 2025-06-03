/**
 * Classe principal para testar o sistema de login
 */
public class ProgramaLogin {
    public static void main(String[] args) {
        Administrador admin = new Administrador("admin", "admin123");
        Visitante visitante = new Visitante("guest", "qualquer");
        Cliente cliente = new Cliente("joao", "segredo123");

        // Administrador
        admin.exibirLogin();
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenha");
        admin.bloquearUsuario();
        admin.registrarLog("Exclusão de conta");
        System.out.println();

        // Visitante
        visitante.exibirLogin();
        System.out.println();

        // Cliente
        cliente.exibirLogin();
        System.out.println("Autenticação com 'segredo123': " + cliente.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + cliente.autenticar("12345"));
    }
}
