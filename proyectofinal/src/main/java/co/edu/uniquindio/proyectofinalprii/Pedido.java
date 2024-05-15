package co.edu.uniquindio.proyectofinalprii;

public class Pedido {
    private PedidoGerente pedidoGerente;
    private PedidoCliente pedidoCliente;
    public PedidoGerente getPedidoGerente() {
        return pedidoGerente;
    }
    public void setPedidoGerente(PedidoGerente pedidoGerente) {
        this.pedidoGerente = pedidoGerente;
    }
    public PedidoCliente getPedidoCliente() {
        return pedidoCliente;
    }
    public void setPedidoCliente(PedidoCliente pedidoCliente) {
        this.pedidoCliente = pedidoCliente;
    }
}
