package org.example;

public class Programa {
    public static void main(String[] args) {

        Conta minhaConta = new Conta();
        Cliente cliente = new Cliente();
        cliente.nome = "Manoel";
        minhaConta.titular.cpf = "1234578911";
        minhaConta.agencia = 1234;
        minhaConta.numero = 123456;
        minhaConta.saldo = 1500;


        System.out.println(minhaConta);
        System.out.println(cliente);
//        Conta c1 = new Conta();
//        c1.titular = "Duke";
//        c1.saldo = 227;
//
//        Conta c2 = new Conta();
//        c2.titular = "Duke";
//        c2.saldo = 227;
//
//        if (c1 == c2){
//            System.out.println("Contas iguais");
//        }

//      saca 200 reais
        minhaConta.sacar(200);
//        Deposita 500 reais
        minhaConta.depositar(500);
        System.out.println("Saldo atual: R$ " + minhaConta.saldo);
    }
}