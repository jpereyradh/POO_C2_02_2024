public class Gato extends Animal {
    private Integer cantidadDeVida;

    public Gato(String nombre, String raza, String color, Integer cantidadDeVida) {
        super(nombre, raza, color);
        this.cantidadDeVida = cantidadDeVida;
    }
}
