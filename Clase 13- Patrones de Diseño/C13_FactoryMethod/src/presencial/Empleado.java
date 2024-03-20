package presencial;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private  int legajo;

    public abstract double calcularSueldo(int dias);

}
