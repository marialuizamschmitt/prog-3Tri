package Exercicios.Ex04;

public class PedidoDelivery extends Pedido implements Desconto{
    public PedidoDelivery(int numPedido, String listaItens, String status) {
        super(numPedido, listaItens, status);
    }

    @Override
    public double aplicarDesconto(double valor) {
        return 0;
    }

    @Override
    public double calcularTotal() {
        return 0;
    }

    @Override
    public void adicionarItem() {

    }

    @Override
    public void removerItem() {

    }
}
