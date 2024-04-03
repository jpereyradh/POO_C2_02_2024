package MesaTrabajo;

public class Circulo implements Figura {
    private static final double PI= 3.141592653589793;
    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (radio*radio)*PI;
    }
}
