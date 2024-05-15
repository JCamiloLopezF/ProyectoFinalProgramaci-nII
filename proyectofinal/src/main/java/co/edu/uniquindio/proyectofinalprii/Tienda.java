package co.edu.uniquindio.proyectofinalprii;

public class Tienda {
    private String nombre;
    private Registro listaRegistros;
    private Cliente listaClientes;
    private Gerente listaGerentes;
    private PedidoGerente listaPedidosGerente;
    private PedidoCliente listaPedidosCliente;
    private Factura listaFacturas;
    
    public Tienda(String nombre, Registro listaRegistros, Cliente listaClientes, Gerente listaGerentes,
            PedidoGerente listaPedidosGerente, PedidoCliente listaPedidosCliente, Factura listaFacturas) {
        this.nombre = nombre;
        this.listaRegistros = listaRegistros;
        this.listaClientes = listaClientes;
        this.listaGerentes = listaGerentes;
        this.listaPedidosGerente = listaPedidosGerente;
        this.listaPedidosCliente = listaPedidosCliente;
        this.listaFacturas = listaFacturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Registro getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(Registro listaRegistros) {
        this.listaRegistros = listaRegistros;
    }

    public Cliente getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Cliente listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Gerente getListaGerentes() {
        return listaGerentes;
    }

    public void setListaGerentes(Gerente listaGerentes) {
        this.listaGerentes = listaGerentes;
    }

    public PedidoGerente getListaPedidosGerente() {
        return listaPedidosGerente;
    }

    public void setListaPedidosGerente(PedidoGerente listaPedidosGerente) {
        this.listaPedidosGerente = listaPedidosGerente;
    }

    public PedidoCliente getListaPedidosCliente() {
        return listaPedidosCliente;
    }

    public void setListaPedidosCliente(PedidoCliente listaPedidosCliente) {
        this.listaPedidosCliente = listaPedidosCliente;
    }

    public Factura getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(Factura listaFacturas) {
        this.listaFacturas = listaFacturas;
    }
}
