package ejemplo;

public class Circulo extends Figura{
    private double radio;

    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public Double calculoDelArea() {
        return null;
    }
    //no me pidio que sobre escriba nada.
}
