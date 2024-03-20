package presencial;

public class Cliente {
    private String nombre, apellido;
    private String cedula;
    private Double saldoEnCuenta;
    private Double limite;
    private Double deuda;

    public Cliente(String nombre, String apellido, String cedula, Double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.limite = limite;
        this.saldoEnCuenta=0.0;
        this.deuda=0.0;
    }
    public void comprar(double importe) throws ClienteException/*aca estoy afirmando que lanzare una exception*/{ //intento comprar 1000 saldo+ importe < limite
        System.out.println("Iniciando el proceso de compra: ");
        if(saldoEnCuenta+importe>limite){
            throw new ClienteException("Supero el limite establecido");
        }else{
            saldoEnCuenta+=importe;
            System.out.println("Compra realizada con éxito");
        }
    }
    public void saldarDeuda(Double importe) throws ClienteException{
        if(deuda<=0){
            throw new ClienteException("No tiene deuda que saldar");
        }if(importe <=0){
            throw new ClienteException("El importe tiene que ser mayor");
        }if(importe>deuda){
            throw new ClienteException("El importe debe ser igual que la deuda");
        }
        deuda-=importe;
        System.out.println("Deuda saldada por $: "+importe);
    }
}
