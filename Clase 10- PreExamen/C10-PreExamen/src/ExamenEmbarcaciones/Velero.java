package ExamenEmbarcaciones;

public class Velero extends Embarcacion{
    private int cantidadDeMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, double eslora, int cantidadDeMastiles) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }
    public boolean esGrande(){
        return cantidadDeMastiles>4;
    }
}
