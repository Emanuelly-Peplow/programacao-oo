/**
 * Classe que representa um funcionário temporário
 */
public class FuncionarioTemporario extends Funcionario {

    /**
     * Construtor
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário com desconto de R$ 100,00
     */
    @Override
    public double calcularSalario() {
        return salarioBase - 100;
    }
}
