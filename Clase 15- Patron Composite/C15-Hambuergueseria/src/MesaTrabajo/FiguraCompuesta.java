package MesaTrabajo;

import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta implements Figura{

    List<Figura> elementos= new ArrayList<>();

    public void agregarFigura(Figura figura){
        elementos.add(figura);
    }
    @Override
    public double calcularArea() {
        double areaTotal=0;
        for (Figura elemento : elementos) {
            areaTotal+=elemento.calcularArea();

        }
        return areaTotal;
    }
}
