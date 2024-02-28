package presencial;

import java.util.Date;

public abstract class Impresora {
    //atributos
    protected String modelo;
    protected String tipoDeConexion;
    protected Date fechaDeFabricacion;
    protected    Integer hojasDisponibles;
    protected Double porcentajeDeTinta;

    public Impresora(String modelo, String tipoDeConexion, Date fechaDeFabricacion, Integer hojasDisponibles, Double porcentajeDeTinta) {
        this.modelo = modelo;
        this.tipoDeConexion = tipoDeConexion;
        this.fechaDeFabricacion = fechaDeFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeDeTinta = porcentajeDeTinta;
    }
    public  Boolean tienePapel(){
        return hojasDisponibles>0; //si se cumple esta condicion es true, sino false.
    }
    public Boolean necesitaTinta(){
        return porcentajeDeTinta<=10;
    }
    public abstract String imprimir();
}
