package Forma2;

public class Main {
    public static void main(String[] args) {
        SujetoObservable usuario= new SujetoObservable("Jorgito");

        SujetoObservador seguidor1= new SujetoObservador("Juan");
        SujetoObservador seguidor2= new SujetoObservador("Jesus");


        usuario.addObserver(seguidor1);
        usuario.addObserver(seguidor2);

        usuario.subirFoto();
        usuario.subirFoto();

        System.out.println(seguidor1.getCantDeNotificaciones());

    }
}
