package presencial;

import java.util.Date;

public class ImpresoraEpson extends Impresora{
    public ImpresoraEpson(String modelo, String tipoDeConexion, Date fechaDeFabricacion, Integer hojasDisponibles, Double porcentajeDeTinta) {
        super(modelo, tipoDeConexion, fechaDeFabricacion, hojasDisponibles, porcentajeDeTinta);
    }

    @Override
    public String imprimir() {
        if(tienePapel() && !necesitaTinta()){
            return "Imprimiendo desde una impresora Epson";
        }else{
        return "Verifique niveles de tinta o hojas.";
    }}

    @Override
    public Boolean tienePapel() {
        return hojasDisponibles>0;
    }


}
