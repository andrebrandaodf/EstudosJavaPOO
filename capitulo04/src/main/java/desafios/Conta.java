package desafios;

public class Conta {

    //Cliente cliente;
    String nome;
    String agencia;
    int numero;
    double saldo;
    Data dataAbertura;

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void depositar(double valor) {
        saldo += valor;

    }

    void calculaRendimento() {
        double rendimento = this.saldo * 0.1;
        System.out.println("Rendimento: R$ " + rendimento);

    }

    void recuperaDadosParaImpressao() {
        System.out.println("Nome: " + nome);
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
