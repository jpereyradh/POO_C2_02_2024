package PatronFactoryMesa;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos= new ArrayList<>();
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public double calcularEspacioNecesario(){
        System.out.println("calculadora total de espacio: ");
        double espacio=0;
        for (Producto producto : productos) {
            espacio+=producto.calcularEspacio();

        }
        return espacio;
    }

}
