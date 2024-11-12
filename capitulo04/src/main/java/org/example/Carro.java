package org.example;

public class Carro {

    String modelo;
    String cor;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor;

    //Liga o carro
    void ligar() {
        System.out.println("Ligando...");
    }

    void desligar() {
        System.out.println("Desligando...");
    }

    void acelerar(double quantidade) {
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
    }

    //Devolve a marcha do carro
    int pegaMarcha(){
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual <= 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual <= 80) {
            return 2;
        }
        return 3;
    }
}
