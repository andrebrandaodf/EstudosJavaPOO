package desafios;

public class Conta {

    //Cliente cliente;
    String nome;
    String agencia;
    int numero;
    double saldo;
    String dataAbertura;

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saque de R$ " + valor);
        System.out.println("Saldo atual: R$ " + saldo);
    }

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor);
        System.out.println("Saldo atual: R$ " + saldo);
    }

    void calculaRendimento() {
        double rendimento = this.saldo * 0.1;
        System.out.println("Rendimento: R$ " + rendimento);
    }
}
