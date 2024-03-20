package RepasoColeccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionDeContactos {
    public static void main(String[] args) throws ColeccionException{
        List<Contacto> listaDeContacto= new ArrayList<>();
        Map<String,String> nombreAnumero= new HashMap<>();

        //agregar contacto
        agregarContacto(listaDeContacto,nombreAnumero,"Juan","1111111");
        agregarContacto(listaDeContacto,nombreAnumero,"Maria","12333111");
        agregarContacto(listaDeContacto,nombreAnumero,"Pablo","1111123787211");
        agregarContacto(listaDeContacto,nombreAnumero,"Pablo","1111123787211");


        //mostrar la lista de contactos
        System.out.println("Lista de Contactos:::");
        for (Contacto contacto : listaDeContacto) {
            System.out.println("Nombre: "+contacto.getNombre()+" Numero Telefonico:"+contacto.getNumero());

        }
        //buscar un contacto por nombre:
        String nombreBuscado="Jorgito";
        try {

            if(nombreAnumero.containsKey(nombreBuscado)){
            System.out.println("Numero de : " + nombreBuscado + " :" + nombreAnumero.get(nombreBuscado));}
        }catch (ColeccionException e){

                throw new ColeccionException("No se encontro el nombre buscado");
                //System.out.println("  Contacto no encontrado: "+nombreBuscado);

        }



        System.out.println("Elementos guardados en el MAPA: ");
        for (Map.Entry<String, String> mapa : nombreAnumero.entrySet()) {
            System.out.println("Nombre: "+mapa.getKey()+ " -Numero: "+mapa.getValue());

        }



    }
    private static void agregarContacto(List<Contacto> lista, Map<String,String> mapa, String nombre, String numero){
        Contacto contacto= new Contacto(nombre, numero);
        lista.add(contacto);
        mapa.put(nombre,numero);
    }
}
