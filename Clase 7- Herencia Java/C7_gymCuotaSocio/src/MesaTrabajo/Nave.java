package MesaTrabajo;

public class Nave extends ObjetoGrafico {
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = 100; //la nave comienza con un valor de 100
    }
    public void girar(char nuevaDireccion){
        //la logica para girar la nave?
        this.direccion= nuevaDireccion;
    }
    public void restaVida(int valor){
        vida-= valor; //esto es lo mismo  vida = vida-valor
    }
}
