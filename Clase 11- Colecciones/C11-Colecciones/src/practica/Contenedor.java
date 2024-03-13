package practica;

public class Contenedor {
    private  int numeroID;
    private Pais procedencia;
    private boolean esPeligroso;

    public Contenedor(int numeroID, Pais procedencia, boolean esPeligroso) {
        this.numeroID = numeroID;
        this.procedencia = procedencia;
        this.esPeligroso = esPeligroso;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public Pais getProcedencia() {
        return procedencia;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numeroID=" + numeroID +
                ", procedencia=" + procedencia +
                ", esPeligroso=" + esPeligroso +
                '}';
    }
}
