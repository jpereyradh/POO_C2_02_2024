package presencial;

public class Jugador implements Comparable<Jugador> {
    private int numeroCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private  boolean esTitular;

    public Jugador(int numeroCamiseta, String nombre, Boolean estaLesionado, boolean esTitular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.esTitular = esTitular;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return 0;
    }

    public boolean isEsTitular() {
        return esTitular;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }
}
