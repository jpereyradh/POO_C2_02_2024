public class Perro  extends Animal{
    private String tamanio;

    public Perro(String nombre, String raza, String color, String tamanio) {
        super(nombre, raza, color);
        this.tamanio = tamanio;
    }
}
