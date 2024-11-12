package org.example;

public class TestaDuasContas {
    public static void main(String[] args) {
       Conta c1 = new Conta();
       Conta c2 = c1;

       c1.depositar(100);
       c2.depositar(200);

       System.out.println(c1.saldo);
       System.out.println(c2.saldo);
    }
}
