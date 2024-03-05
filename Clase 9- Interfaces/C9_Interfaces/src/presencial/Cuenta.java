package presencial;

public abstract class Cuenta {
    protected double saldo;

     public abstract void extraer(double monto);
     public void depositar(double monto){
         saldo+= monto; //acumulo en saldo el monto a depositar
              }
     public void informarSaldo(){
         System.out.println("Saldo actual: "+saldo);
     }
}
