package MesaTrabajoStatePatron;

public class PruebaCarrito {
    public static void main(String[] args) {
        CarritoDeCompras carritoDeCompras= new CarritoDeCompras();

        Producto producto1= new Producto("Coca ",20);
        Producto producto2= new Producto("Fanta ",2);
        Producto producto3= new Producto("Sandwich ",20);

        carritoDeCompras.agregarProducto(producto1);
        carritoDeCompras.agregarProducto(producto2);
        carritoDeCompras.agregarProducto(producto3);

        carritoDeCompras.siguienteEstado();
        carritoDeCompras.agregarProducto(new Producto("snack",200));

        carritoDeCompras.siguienteEstado();
        carritoDeCompras.agregarProducto(new Producto("DDL",20));




    }
}
