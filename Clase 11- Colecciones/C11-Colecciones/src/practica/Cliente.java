package practica;

public class Cliente {
    public static void main(String[] args) {
        Puerto puerto= new Puerto();
        puerto.ingreseContendedor(4,Pais.BRASIL,false);
        puerto.ingreseContendedor(2,Pais.DESCONOCIDO,true);
        puerto.ingreseContendedor(1,Pais.DESCONOCIDO,true);
        puerto.ingreseContendedor(3,Pais.DESCONOCIDO,true);
        puerto.ingreseContendedor(5,Pais.DESCONOCIDO,true);
        System.out.println("Contenedores ingresados:::");
        puerto.mostrarContenedores();
        int cantiPeligroso= puerto.contarContenedoresPeligrososDesconodidos();
        System.out.println("Contenedores peligrosos: "+cantiPeligroso);

    }
}
