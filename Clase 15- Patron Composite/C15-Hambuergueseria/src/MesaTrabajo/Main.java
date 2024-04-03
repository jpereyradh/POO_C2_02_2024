package MesaTrabajo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo= new Rectangulo(5,4);
        Circulo circulo= new Circulo(1);
        Circulo circulo2= new Circulo(1);
        Circulo circulo3= new Circulo(1);

        FiguraCompuesta vagon= new FiguraCompuesta();
        vagon.agregarFigura(rectangulo);
        vagon.agregarFigura(circulo);
        vagon.agregarFigura(circulo2);
        vagon.agregarFigura(circulo3);

        System.out.println("Caculo de area de un rectangulo 5x4:  "+rectangulo.calcularArea());
        System.out.println("Caculo de area de un circulo radio 1:  "+circulo.calcularArea());


        System.out.println("calculo total del area compuesto: "+vagon.calcularArea());



    }
}
