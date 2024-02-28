package ejemplo;

public abstract class Figura {
    //con la manera de acceder a los atributos o visibilidad.
    //protected: el atributo es privado para una no hija. y es publico para una hija
    //public : atributo accesible desde cualquier clase.
    //private: atributo accesible solo desde la clase que se crea.

    protected int x;
    protected int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void dibujar(){
        System.out.println("Dibujando una figura");
    };
    public abstract Double calculoDelArea();
}
