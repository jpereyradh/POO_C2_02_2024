package presencial;
//implementacion del observador
public class Seguidor implements Observador {
    private String nombre;
    private int cantidadDeNotificaciones=0;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre+" : "+mensaje);
        cantidadDeNotificaciones++;

    }

    public int getCantidadDeNotificaciones() {
        System.out.println("El usuario: "+nombre+" tuvo la cantidad de notificaciones: ");
        return cantidadDeNotificaciones;
    }
}
