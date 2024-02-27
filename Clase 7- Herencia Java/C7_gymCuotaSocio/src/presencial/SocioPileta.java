package presencial;

public class SocioPileta extends Socio {
    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioPileta(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad, Double costoPileta, Boolean estaHabilitado) {
        super(nombre, numeroSocio, cuotaMensual, actividad); //son los valores del constructor del padre
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }

    public SocioPileta(String nombre, Double cuotaMensual, Double costoPileta) {
        super(nombre, cuotaMensual);
        this.costoPileta = costoPileta;
    }
    //metodo para habilitar al socio para que pueda ingresar a la pileta..

    public void habilitarSocioPileta(){
        estaHabilitado= true;
    }
   public void deshabilitarSocioPileta(){
        estaHabilitado= false;
   }

    @Override //esta es la firma del metodo. estoy asegurando que es el metodo del padre.
    public Double calcularcostoMensual() {
        if(estaHabilitado){ // V o F --Si o No
            return super.calcularcostoMensual()+costoPileta;
        }else{
        return  super.calcularcostoMensual();
        }

    }

    public void setEstaHabilitado(Boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }

    public Double getCostoPileta() {
        return costoPileta;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
