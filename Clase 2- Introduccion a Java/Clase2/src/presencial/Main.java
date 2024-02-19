package presencial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("********Bienvenidos al Sistema de Ingreso de Personas**********");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre= scanner.nextLine();
        char unaLetra= nombre.charAt(2);
        System.out.println(unaLetra);
        char primeraLetra=obtenerPrimeraLetra(nombre);
        char ultimaLetra= obtenerUltimaLetra(nombre);
        System.out.println("Ingrese su Edad: ");
        Integer edad= scanner.nextInt();
        System.out.println("Ingrese su altura: ");
        Double altura= scanner.nextDouble();

        scanner.close();
        System.out.println("Los datos ingresados : ");
        System.out.println(nombre+" ,"+edad+" ,"+altura);
        System.out.println("Inicial: "+primeraLetra);
        System.out.println("****************************");
        System.out.println("Ultima Letra: "+ultimaLetra);
        System.out.println("La Persona es Mayor de Edad: ???"+"------------->"+esMayorDeEdad(edad));

    }
    public static char obtenerPrimeraLetra(String nombre){
        return nombre.charAt(0);
       }
    public static char obtenerUltimaLetra(String nombre){
        return nombre.charAt(nombre.length()-1);
    }
    public static boolean esMayorDeEdad(int edad){
        System.out.println("*************************** validando edad**************");
        return edad >= 18; //por defecto va a ser TRUE
    }
}
