package presencial;

public class Feliz implements EstadoTamagotchi{
    @Override
    public void recibirComida() {
        System.out.println("tamagotchi se pone Sediento");

    }

    @Override
    public void recibirBebida() {
        System.out.println("Se pone hambriento");

    }

    @Override
    public void recibirMimos() {
        System.out.println("sin cambio");

    }
}
