package Exercicios.Ex04;

public abstract class Pedido {

    int numPedido;
    String listaItens;
    String status;

    public Pedido (int numPedido, String listaItens, String status){
        this.numPedido = numPedido;
        this.listaItens = listaItens;
        this.status = status;
    }

    public abstract double calcularTotal();

    public abstract void adicionarItem();
    public abstract void removerItem();

}
