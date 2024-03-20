package presencial;

public class Main {
    public static void main(String[] args) throws ClienteException {
        Cliente cliente= new Cliente("Jorgito","Pereyra","1111",100.0);

        try {
            cliente.comprar(200.0);
        }catch (ClienteException e){
            System.out.println(e.getMessage());
        }
        System.out.println("sigue el proceso normal de funcionamiento");
        int i=20/0;

        System.out.println("sigue el proceso normal de funcionamiento");

    }
}
