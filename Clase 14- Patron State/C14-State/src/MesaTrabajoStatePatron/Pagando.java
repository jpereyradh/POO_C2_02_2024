package MesaTrabajoStatePatron;

public class Pagando implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No se admiten mas productos en el proceso de pago");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("cancelando compra");

    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("no se puede al punto anterior");
    }

    @Override
    public void siguienteEstado() {
        System.out.println("Compra realizada , el carrito esta cerrado");
    }
}
