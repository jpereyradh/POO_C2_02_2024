package presencial;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta= new CuentaCorriente();
        cuenta.depositar(1000);
        cuenta.informarSaldo();

        double impuestito= cuenta.gravar(5);
        System.out.println("Impuesto gravado: "+impuestito);
        cuenta.informarSaldo();
    }
}
