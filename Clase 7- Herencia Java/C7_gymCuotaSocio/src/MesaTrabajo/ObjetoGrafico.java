package MesaTrabajo;

import java.util.Objects;

public class ObjetoGrafico {
    private int posx;
    private int posy;
    protected  char direccion;

    public ObjetoGrafico(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }
    public void irA(int x, int y, char nuevaDireccion){
        //la logica para mover el objeto a la nueva posicion y direccion
        this.posx= x;
        this.posy= y;
        this.direccion= nuevaDireccion;
    }

    @Override
    public String toString() {
        return "Posicion: {" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public int hashCode() {
        //segun las necesidades
        return Objects.hash(posx,posy,direccion);
    }
}
