package ExamenEstudiante;

public class ExamenParcial extends Examen{
    private int numeroUnidad;
    private int numeroIntentos;

    public ExamenParcial(Alumno alumno, String titulo, String enunciado, int nota, int numeroUnidad, int numeroIntentos) {
        super(alumno, titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.numeroIntentos = numeroIntentos;
    }
    public boolean sePuedeRecuperar(){
        if(numeroUnidad<=3){
            return numeroIntentos<3;
        }else{
            return numeroIntentos<2;
        }

    }
}
