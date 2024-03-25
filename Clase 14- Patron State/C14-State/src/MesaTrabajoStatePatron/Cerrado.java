package MesaTrabajoStatePatron;

public class Cerrado implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("no se admiten mas productos");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("no se puede cancelar");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("no se puede arrepentir");
    }

    @Override
    public void siguienteEstado() {
        System.out.println("no hay mas estados posibles");
    }
}
