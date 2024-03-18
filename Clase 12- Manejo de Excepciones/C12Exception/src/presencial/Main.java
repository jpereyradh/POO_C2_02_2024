package presencial;

public class Main {
    public static void main(String[] args)  {
        Cliente cliente= new Cliente("Jorgito","Laurenti",11111,1.0);

                try {
                    cliente.comprar(2500.0); //aca se detuvo
                }catch (ClienteException e){
                    System.out.println(e.getMessage());
                }
        System.out.println("el software siguio el flujo normal de funcionamiento");




    }
}
