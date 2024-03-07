package ExamenEstudiante;

public class Examen {
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    protected int nota;

    public Examen(Alumno alumno, String titulo, String enunciado, int nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }
    public boolean estaAprobado(){
        return nota>=4;
    }
}
