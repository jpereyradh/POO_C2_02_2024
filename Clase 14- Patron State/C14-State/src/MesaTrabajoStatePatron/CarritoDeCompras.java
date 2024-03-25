package MesaTrabajoStatePatron;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private EstadoCarrito estado;
    private List<Producto> productos= new ArrayList<>();

    public CarritoDeCompras(){
        estado = new Vacio();
    }
    public void agregarProducto(Producto producto){
        estado.agregarProducto(producto);
        productos.add(producto);
    }
    public void cancelarCarrito(){
        estado.cancelarCarrito();
        productos.clear();
    }
    public void volverAlPuntoAnterior(){
        estado.volverPuntoAnterior();
    }
    public  void siguienteEstado(){
        estado.siguienteEstado();
    }
}
