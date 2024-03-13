package practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Puerto {
    private List<Contenedor> listaContendedores;

    public Puerto() {
        listaContendedores= new ArrayList<>();
    }
    public void ingreseContendedor(int numero, Pais procedencia, boolean peligroso){
        Contenedor contenedor= new Contenedor(numero,procedencia,peligroso);
        listaContendedores.add(contenedor);
    }
    public int contarContenedoresPeligrososDesconodidos(){
        int contador=0;
        for (Contenedor contenedor : listaContendedores) {
            if(contenedor.isEsPeligroso()&&contenedor.getProcedencia()==Pais.DESCONOCIDO){
                contador++;
            }

        }
        return contador;
    }
    public void mostrarContenedores(){
        Collections.sort(listaContendedores, Comparator.comparingInt(Contenedor::getNumeroID));
        for (Contenedor contenedor : listaContendedores) {
            System.out.println(contenedor);

        }
    }
}
