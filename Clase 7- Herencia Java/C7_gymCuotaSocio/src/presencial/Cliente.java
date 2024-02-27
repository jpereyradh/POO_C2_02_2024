package presencial;

public class Cliente {
    public static void main(String[] args) {
        //que necesito ? para comenzar a probar? los objetos creados
        SocioPileta socio1 = new SocioPileta("Jorgito",
                1010,100.0,"Musculacion",50.0,false); //atajo ctrl+p para visualizar los param
        SocioPileta socio2 = new SocioPileta("Julian",1011,100.0,"Musculacion",50.0,true);
        SocioPileta socio3= new SocioPileta("Rocio",150.0,50.0);
        socio3.setEstaHabilitado(true);



        System.out.println("El socio 1 va a pagar:_ "+socio1.calcularcostoMensual()+ "Jorgito no esta habilitado");
        System.out.println("El socio 2 : "+socio2.calcularcostoMensual()+ "Julian si esta habilitado");
        System.out.println("El socio 3 : "+socio3.calcularcostoMensual());
        System.out.println("el costo de la pileta es: "+socio3.getCostoPileta());

        System.out.println(socio1.toString());
    }
}
