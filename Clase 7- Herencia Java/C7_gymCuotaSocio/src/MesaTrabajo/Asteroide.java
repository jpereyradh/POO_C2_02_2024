package MesaTrabajo;

public class Asteroide extends ObjetoGrafico {
    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }
}
