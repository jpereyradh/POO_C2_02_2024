package presencial;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productos= new ArrayList<>();

    public  void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public double calcularPrecioTotal(){
        double precioTotal=0;
        for (Producto producto : productos) {
            precioTotal+=producto.getPrecio();
        }

        return precioTotal; //el enunciado decia que habia que darle un descuento
    }

}
