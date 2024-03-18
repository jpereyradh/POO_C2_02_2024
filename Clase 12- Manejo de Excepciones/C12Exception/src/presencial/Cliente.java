package presencial;

public class Cliente {
    private String nombre;
    private String apellido;
    private Integer cedula;
    private Double saldoEnCuenta;
    private Double limiteDeCompra;
    private Double deuda;

    public Cliente(String nombre, String apellido, Integer cedula, Double limiteDeCompra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.saldoEnCuenta = 0.0;
        this.limiteDeCompra = limiteDeCompra;
        this.deuda = 0.0;
    }
    public void comprar(Double importe) throws ClienteException{//la firma de la ex
        //int x=10/0;
        if(saldoEnCuenta+importe>limiteDeCompra){
            //int x=10/0;
           throw new ClienteException("No se pudo llevar a cabo la compra debido a que supero el limite establecido");

        }else{
            System.out.println("Compra exitosa");
            saldoEnCuenta+=importe;
        }

    }
    public void saldarDeuda(Double importe) throws ClienteException{
        if(deuda<=0){
            throw new ClienteException("NO tiene deuda que saldar.");
        }
        if(importe<=0){
            throw new ClienteException("El importe debe ser mayor a 0");
        }
        if(importe> deuda){
            throw new ClienteException("el importe ingresado es mayor  que la deuda");
        }
        deuda-=importe;
        System.out.println("Cuenta saldada: ");
    }
}
