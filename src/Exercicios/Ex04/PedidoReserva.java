package Exercicios.Ex04;

public class PedidoReserva extends Pedido{
    public PedidoReserva(int numPedido, String listaItens, String status) {
        super(numPedido, listaItens, status);
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
