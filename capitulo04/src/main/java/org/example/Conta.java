package org.example;

public class Conta {

    int numero = 1234;
    int agencia = 2222;
    Cliente titular = new Cliente();
    double saldo = 1000.00;

//    void sacar(double quantidade) {
//      double novoSaldo = this.saldo - quantidade;
//        this.saldo = novoSaldo;
//    }

    void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

//    void transferir(Conta destino, double valor) {
//        this.saldo = this.saldo - valor;
//        destino.saldo = destino.saldo + valor;
//    }

    boolean transferir(Conta destino, double valor) {
        boolean retirou = this.sacar(valor);
        if (retirou == false) {
            //Não deu para sacar!
            return false;
        } else {
            destino.depositar(valor);
            return true;
        }
    }
}

