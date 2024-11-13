package desafios;

public class TestaConta {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.nome = "Hugo";
        conta.agencia = "123";
        conta.numero = 1234;
        conta.saldo = 1000.00;

        Conta conta2 = new Conta();
        conta2.nome = "Joao";
        conta2.agencia = "123";
        conta2.numero = 1234;
        conta2.saldo = 500.00;

        if (conta == conta2){
            System.out.println("-------------- CONTAS IGUAIS  --------------");
        }
        else{
            System.out.println("-------------- CONTAS DIFERENTES -------------- ");
        }

        conta.sacar(200);
        conta.depositar(1000.00);
        conta.calculaRendimento();

        conta.recuperaDadosParaImpressao();
    }
}
