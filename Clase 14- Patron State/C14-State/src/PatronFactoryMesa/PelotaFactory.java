package PatronFactoryMesa;

public class PelotaFactory implements ProductoFactory{
    @Override
    public Producto crearProducto() {
        return new Pelota(11);
    }
}
