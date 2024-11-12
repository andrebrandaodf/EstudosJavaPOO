package org.example;

public class TestaAlgunsMetodos {
    public static void main(String[] args) {

        Conta minhaConta = new Conta();
        Cliente cliente = new Cliente();
        minhaConta.titular.nome = "Duke";
        minhaConta.saldo = 1000;

        minhaConta.depositar(500);

        if (minhaConta.sacar(2000)) {
            System.out.println("Saque realizado com sucesso! \n");
        } else {
            System.out.print("Não consegui sacar: \n");
        }

        System.out.println("Saldo atual: R$ " + minhaConta.saldo);
    }
}
