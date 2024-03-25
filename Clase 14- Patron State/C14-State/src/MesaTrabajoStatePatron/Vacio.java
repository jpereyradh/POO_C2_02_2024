package MesaTrabajoStatePatron;

public class Vacio  implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("agregando producto: "+producto.getNombre()+" Precio: "+ producto.getPrecio());

    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Carrito Cancelado");

    }

    @Override
    public void volverPuntoAnterior() {
 //no hace nada
    }

    @Override
    public void siguienteEstado() {
        System.out.println("siguiente estado: cargando.......");


    }
}
