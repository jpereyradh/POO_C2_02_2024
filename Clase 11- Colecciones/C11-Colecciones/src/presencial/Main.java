package presencial;

public class Main {
    public static void main(String[] args) {
        Equipo equipo= new Equipo("Deportivo DH");
        equipo.addJugador(new Jugador(10,"Juan",true,true));
        equipo.addJugador(new Jugador(20,"Jorgito",true,true));

        equipo.mostrarJugadoresTitulares();
        System.out.println("cantidad de lesionados: "+equipo.getCantidadDeJugadoresLesionados());

    }
}
