package PatronFactoryMesa;

public class Caja extends Producto{
    private double longitud, ancho, altura;

    public Caja(double longitud, double ancho, double altura) {
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularEspacio() {
        //como calcular el espacio
        return longitud*ancho*altura;
    }
}
