package presencial;

public class CuentaCorriente extends Cuenta implements GravadorDeImpuesto{
    private double descubiertoPermitido;

    @Override
    public void extraer(double monto) { //100, 50,60
        if(monto<=saldo+descubiertoPermitido){
            saldo-=monto;
            System.out.println("Extraccion correcta");
        } else{
            System.out.println("Excededimos el limite permitido");
        }

    }

    @Override
    public Double gravar(double porcentaje) {
        double impuesto= saldo*(porcentaje/100);
        saldo-=impuesto;
        return impuesto;
    }
}
