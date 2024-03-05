package presencial;

public class CajaDeAhorro extends Cuenta{
    private double interes_caja_ahorro= 1.2;
    @Override
    public void extraer(double monto) {
        if(monto<=saldo){
            saldo-=monto; //100 <= 200?--> si, 200-100; saldo= 100
            //saldo = saldo-monto;
            System.out.println("Extraccion correcta");
        }else{
            System.out.println("Ingrese un monto/ saldo insuficiente");
        }
    }
    public void cobrarIntereses(){
        saldo+=saldo*(interes_caja_ahorro/100);
    }
}
