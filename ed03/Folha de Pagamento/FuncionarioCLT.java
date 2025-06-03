/**
 * Classe que representa um funcionário CLT
 */
public class FuncionarioCLT extends Funcionario {

    /**
     * Construtor
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário com adicional de R$ 300,00
     */
    @Override
    public double calcularSalario() {
        return salarioBase + 300;
    }
}
