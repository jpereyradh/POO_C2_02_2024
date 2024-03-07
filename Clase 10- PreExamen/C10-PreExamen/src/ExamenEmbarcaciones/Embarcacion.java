package ExamenEmbarcaciones;

public class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioDeFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.eslora = eslora;
    }
    public double calcularElMontoDelAlquiler(){
        double montoAlquiler= precioBase;
        if(anioDeFabricacion>2020){
            montoAlquiler+=valorAdicional;
        }else{
            return montoAlquiler;
        }
        return montoAlquiler;
    }
}
