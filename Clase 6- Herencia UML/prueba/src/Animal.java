public class Animal {
    private String nombre;
    private   String raza;
    private   String color;

    public Animal(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    private String getRaza() {
        return raza;
    }
}
