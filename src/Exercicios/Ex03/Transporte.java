package Exercicios.Ex03;

public abstract class Transporte {

    int capacidade;
    double velocidadeMax;

    public Transporte(int capacidade, double velocidadeMax){
        this.capacidade = capacidade;
        this.velocidadeMax = velocidadeMax;
    }

    public abstract void mover();
    public abstract void parar();




}
