package presencial;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1= new Usuario("Jorgito","Pereyra");
        Usuario usuario2= new Usuario("Max","Powel");

        Seguidor seguidor1= new Seguidor("Juan");
        Seguidor seguidor3= new Seguidor("Eduardo");
        Seguidor seguidor2= new Seguidor("Sofia");

        usuario1.agregarSeguidor(seguidor1);
        usuario1.agregarSeguidor(seguidor2);
        usuario2.agregarSeguidor(seguidor3);

        String mensaje=usuario1.subirFoto();

        usuario1.notificarSeguidores(mensaje);
        String mensaje2=usuario1.subirFoto();

        usuario1.notificarSeguidores(mensaje2);


        System.out.println(seguidor1.getCantidadDeNotificaciones());

    }
}
