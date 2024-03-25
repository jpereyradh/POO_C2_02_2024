package presencial;

public class Sediento implements EstadoTamagotchi{
    @Override
    public void recibirComida() {
        System.out.println("Se pone triste");
    }

    @Override
    public void recibirBebida() {
        System.out.println("Se pone feliz");
    }

    @Override
    public void recibirMimos() {
        System.out.println("Sin cambios");

    }
}
