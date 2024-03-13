package presencial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> listaJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        listaJugadores= new ArrayList<>();
    }
    public void addJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }
    public  void mostrarJugadoresTitulares(){
        System.out.println("Lista de Jugadores Titulares");
        listaJugadores.stream().filter(Jugador::isEsTitular).sorted().forEach(jugador -> System.out.println(jugador.getNombre()+" - "+jugador.getNumeroCamiseta()));
    }
    public int getCantidadDeJugadoresLesionados(){
        return (int)listaJugadores.stream().filter(jugador -> jugador.isEsTitular()&& jugador.getEstaLesionado()).count();
    }
}
