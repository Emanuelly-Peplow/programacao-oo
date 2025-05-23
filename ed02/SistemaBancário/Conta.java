/**
 * Classe base para contas bancárias
 * Representa uma conta com cliente e saldo, permitindo operações básicas
 */
public class Conta {
    protected String cliente;
    protected double saldo;

    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    /**
     * Adiciona valor ao saldo da conta
     */
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
     * Remove valor do saldo se houver saldo suficiente
     */
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    /**
     * Transfere valor para outra conta, se houver saldo suficiente
     */
    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    /**
     * Retorna o saldo atual da conta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime as informações da conta
     */
    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + saldo);
    }

    /**
     * Aplica juros diários à conta. Cada tipo de conta define sua lógica.
     */
    public void aplicarJurosDiarios() {
    }
}