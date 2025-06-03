/**
 * Classe para testar o sistema
 */
public class ProgramaFolha {
    public static void main(String[] args) {
        Funcionario funcionario1 = new FuncionarioCLT("Carlos", 2000.0);
        Funcionario funcionario2 = new FuncionarioTemporario("Ana", 2000.0);

        funcionario1.exibirDados();
        System.out.println("Salário Final: " + funcionario1.calcularSalario());
        System.out.println();

        funcionario2.exibirDados();
        System.out.println("Salário Final: " + funcionario2.calcularSalario());
    }
}
