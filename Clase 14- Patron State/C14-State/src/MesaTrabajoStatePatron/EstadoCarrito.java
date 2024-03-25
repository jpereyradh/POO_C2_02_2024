package MesaTrabajoStatePatron;

public interface EstadoCarrito {
    void agregarProducto(Producto producto);
    void cancelarCarrito();
    void volverPuntoAnterior();
    void siguienteEstado();
}
