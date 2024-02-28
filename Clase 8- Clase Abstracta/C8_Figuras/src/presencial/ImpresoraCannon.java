package presencial;

import java.util.Date;

public class ImpresoraCannon extends Impresora {
    public ImpresoraCannon(String modelo, String tipoDeConexion, Date fechaDeFabricacion, Integer hojasDisponibles, Double porcentajeDeTinta) {
        super(modelo, tipoDeConexion, fechaDeFabricacion, hojasDisponibles, porcentajeDeTinta);
    }

    @Override
    public String imprimir() {
        if(tienePapel() && !necesitaTinta()){
            return "Imprimiendo desde una impresora Cannon";
        }else{
            return "Verifique niveles de tinta o hojas.";
        }
    }

    @Override
    public Boolean necesitaTinta() {
        return porcentajeDeTinta<=20;
    }
}
