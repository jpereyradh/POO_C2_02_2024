package Forma2;

import java.util.Observable;
import java.util.Observer;

//seguidor
public class SujetoObservador implements Observer {
    private String nombre;
    private int cantDeNotificaciones=0;

    public SujetoObservador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(Observable o, Object arg) {
        String mensaje= (String)arg;
        System.out.println(nombre+" fue notificdo de la foto: "+mensaje);
        cantDeNotificaciones++;
    }

    public int getCantDeNotificaciones() {
        return cantDeNotificaciones;
    }
}
