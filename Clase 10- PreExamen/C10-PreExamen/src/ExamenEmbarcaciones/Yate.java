package ExamenEmbarcaciones;

public class Yate extends Embarcacion implements Comparable<Yate>{
    private int cantidadDeCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, double eslora, int cantidadDeCamarotes) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }
    public boolean tieneMayorLujoQue(Yate otroYate){
        return cantidadDeCamarotes>otroYate.cantidadDeCamarotes;
    }

    @Override
    public int compareTo(Yate o) {
        return 0;
    }

   /* @Override
    public int compareTo(Yate otroYate) {
        return (boolean)cantidadDeCamarotes>otroYate.cantidadDeCamarotes;
    }*/
}
