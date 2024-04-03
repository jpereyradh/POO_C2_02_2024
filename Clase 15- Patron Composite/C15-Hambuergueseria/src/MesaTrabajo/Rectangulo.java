package MesaTrabajo;

public class Rectangulo implements Figura{
    private double alto, largo;

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return alto*largo;
    }
}
