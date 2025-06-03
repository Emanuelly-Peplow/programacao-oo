/**
 * Classe abstrata que representa um funcionário genérico
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    /**
     * Construtor
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe o nome e o salário base do funcionário
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    /**
     * Método abstrato para calcular o salário final
     */
    public abstract double calcularSalario();
}
