package presencial;

public class Socio {
    private String nombre;
    private Integer numeroSocio;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public Socio(String nombre, Double cuotaMensual) {
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
    }

    public Double calcularcostoMensual(){
        return cuotaMensual+(0.05*cuotaMensual); //cuotaMensual* 1.05;
 }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", numeroSocio=" + numeroSocio +
                ", cuotaMensual=" + cuotaMensual +
                ", actividad='" + actividad + '\'' +
                '}';
    }
}
