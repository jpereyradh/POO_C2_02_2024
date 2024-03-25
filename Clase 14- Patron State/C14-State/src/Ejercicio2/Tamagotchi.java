package Ejercicio2;

public class Tamagotchi {
    private String estado;

    public Tamagotchi() {
        estado= "hambriento";
    }

    public void recibirComida(){
        if(estado.equals("hambriento")){
            estado= "Feliz";
            System.out.println("Se pone Feliz");
        } else if (estado.equals("Triste")) {
            System.out.println("Vomita");
        } else if (estado.equals("Sediento")) {
            estado= "Triste";
            System.out.println("La mascota se pone triste");
        }
    }
    public void recibirBebida(){
        if(estado.equalsIgnoreCase("feliz")){
    estado= "Hambriento";
            System.out.println("la mascota tiene hambre");
        } else if (estado.equals("Triste")) {
            System.out.println("hace 3 beep y titila el display");
    } else if (estado.equalsIgnoreCase("Sediento")) {
        estado= "Feliz";
        System.out.println("La mascota se pone feliz");
    } else if (estado.equalsIgnoreCase("hambriento")) {
            estado= "Se pone triste";

        }
    }
    public void recibirMimos(){
        if(estado.equalsIgnoreCase("hambriento")){
            estado= "sin cambios ";
            System.out.println("no tiene cambios para mostrar");

        } else if (estado.equals("Triste")) {
            System.out.println("Se pone feliz");
        } else if (estado.equalsIgnoreCase("Sediento")) {
            estado= "sin cambios";

        }
    }
}
