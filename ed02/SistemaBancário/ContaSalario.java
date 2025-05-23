/**
 * Representa uma conta salário que não aplica juros
 */
public class ContaSalario extends Conta {

    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Não aplica juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n-Extrato Conta Salário-");
        super.imprimirExtrato();
    }
}
