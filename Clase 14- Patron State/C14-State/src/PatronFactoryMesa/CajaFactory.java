package PatronFactoryMesa;

public class CajaFactory implements ProductoFactory{
    @Override
    public Producto crearProducto() {
        return new Caja(10,10,10);
    }
}
