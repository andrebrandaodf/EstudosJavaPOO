package desafios;

public class TestaConta {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.nome = "Joao";
        conta.agencia = "123";
        conta.numero = 1234;
        conta.saldo = 500.00;

        conta.sacar(200);
        conta.depositar(1000.00);
        conta.calculaRendimento();
    }
}
