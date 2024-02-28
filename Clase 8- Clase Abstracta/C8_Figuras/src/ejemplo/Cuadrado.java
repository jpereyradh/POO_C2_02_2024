package ejemplo;

public class Cuadrado extends Figura{

    private int lado;

    public Cuadrado(int x, int y, int lado) {
        super(x, y);
        this.lado = lado;

    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }

    @Override
    public Double calculoDelArea() {
        return null;
    }
}
