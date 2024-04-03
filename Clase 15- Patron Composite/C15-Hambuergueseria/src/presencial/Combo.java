package presencial;

import java.util.ArrayList;
import java.util.List;
//esta clase se llama compuesto
public class Combo extends Producto{

    List<Producto> productos;
    public Combo(String nombre) {
        super(nombre, 0); //inicialmente un combo cuesta 0
        productos= new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    @Override
    public double getPrecio() {
        double precioTotal=0;
        for (Producto producto : productos) {
            precioTotal+=producto.getPrecio();
        }

        return precioTotal*0.9; //el enunciado decia que habia que darle un descuento
    }
}
