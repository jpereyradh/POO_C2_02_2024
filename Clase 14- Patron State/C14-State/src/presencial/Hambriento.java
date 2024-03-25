package presencial;

public class Hambriento implements EstadoTamagotchi{
    @Override
    public void recibirComida() {
        System.out.println("Se pone feliz");
    }

    @Override
    public void recibirBebida() {
        System.out.println(" se pone triste");
    }

    @Override
    public void recibirMimos() {
        System.out.println("Sin cambio");

    }
}
