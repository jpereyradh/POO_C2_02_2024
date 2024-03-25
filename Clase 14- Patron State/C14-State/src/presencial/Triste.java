package presencial;

public class Triste implements EstadoTamagotchi{
    @Override
    public void recibirComida() {
        System.out.println("Tamagotchi vomita");
    }

    @Override
    public void recibirBebida() {
        System.out.println("Titila el display 3 veces");

    }

    @Override
    public void recibirMimos() {
        System.out.println("Se Pone Feliz");

    }
}
