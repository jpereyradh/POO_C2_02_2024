package presencial;

public class Main {
    public static void main(String[] args) {
        CarritoDeCompras carrito= new CarritoDeCompras();
        Producto burger= new Sandwich("doble",100);
        Producto papa = new Acompanamiento("mediana",20);
        Producto bebida= new Bebida("Guarana",30);

        Combo combo= new Combo("DH food");
        combo.agregarProducto(burger);
        combo.agregarProducto(papa);
        System.out.println("Precio total en combo: "+combo.getPrecio());
        carrito.agregarProducto(combo);
        System.out.println("precio total a abonar: "+carrito.calcularPrecioTotal());
        System.out.println("ahora agrego la bebida");
        carrito.agregarProducto(bebida);
       System.out.println("calculo total con bebida: "+carrito.calcularPrecioTotal());


    }
}
