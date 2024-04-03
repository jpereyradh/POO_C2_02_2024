package Forma2;

import java.util.Observable;

//usuario
public class SujetoObservable extends Observable {
    private String nombre;

    public SujetoObservable(String nombre) {
        this.nombre = nombre;
    }
    public void subirFoto(){
        String mensaje= nombre+" subio una foto";
        setChanged();
        notifyObservers(mensaje);
    }
}
