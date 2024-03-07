package ExamenEstudiante;

public class ExamenFInal extends Examen implements Comparable<ExamenFInal> {
    private int notaOral;
    private String temaOral;

    public ExamenFInal(Alumno alumno, String titulo, String enunciado, int nota, int notaOral, String temaOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }
    public boolean esMayorQue(ExamenFInal otroExamen){
        double promedioThis= (double) (notaOral+nota)/2;
        double promedioOtro= (double)(otroExamen.nota+ otroExamen.notaOral)/2;
        return promedioThis>promedioOtro;
    }

    @Override
    public int compareTo(ExamenFInal o) {
        return 0;
    }
}
