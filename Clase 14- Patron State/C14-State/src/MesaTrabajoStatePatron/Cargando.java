package MesaTrabajoStatePatron;


import java.util.ArrayList;
import java.util.List;

public class Cargando implements EstadoCarrito{
    List<Producto> productos= new ArrayList<>();

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado correctamente");
    }

    @Override
    public void cancelarCarrito() {
        productos.clear();
        System.out.println("carrito cancelado");

    }

    @Override
    public void volverPuntoAnterior() {
        cancelarCarrito();
    }

    @Override
    public void siguienteEstado() {
        System.out.println(" pasa al siguiente estado: pagando");
    }
}
