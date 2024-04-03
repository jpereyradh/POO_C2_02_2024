package presencial;

import java.util.ArrayList;
import java.util.List;

//sujeto observable
public class Usuario {
    private String nombre, apellido;
     private List<Observador> seguidores= new ArrayList<>();

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String subirFoto(){
        String mensaje=this.nombre+" a subido una foto";
        return mensaje;
    }
    public void agregarSeguidor(Observador observador){
        seguidores.add(observador);
    }
    public void eliminarUnSeguidor(Observador observador){
        seguidores.remove(observador);
    }
    public void notificarSeguidores(String mensaje){
        for (Observador seguidor : seguidores) {
            seguidor.notificar(mensaje);

        }
    }
}
