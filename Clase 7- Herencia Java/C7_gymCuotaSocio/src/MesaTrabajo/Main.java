package MesaTrabajo;

public class Main {
    public static void main(String[] args) {
        Nave nave= new Nave(10,20,'S',1.5);
        Asteroide asteroide= new Asteroide(30,40,'N',50);


        nave.irA(15,25,'N');
        asteroide.irA(35,45,'O');

        System.out.println(nave.toString());
        System.out.println(asteroide.toString());
        }
}
