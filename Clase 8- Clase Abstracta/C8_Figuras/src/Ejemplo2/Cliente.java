package Ejemplo2;

public class Cliente {
    public static void main(String[] args) {
        Animal animal;
        animal= new Perro();
        animal.emiteSonido();

        animal= new Gato();
        animal.emiteSonido();


        //hablemos de Casting(conversion de tipo)
        //convertir un tipo de dato a otro.
        //tenemos dos tipos de casteo implicito o explicito
        //casteo implicito
        System.out.println("Casteo implicito");
        Perro perro = new Perro();
        Animal animal1= perro; //casteando implicitamente.
        animal1.emiteSonido();

        System.out.println("Casteo explicito");
        //casteo explicito
        Animal animalExplicito = new Gato();
        Gato gato= (Gato) animalExplicito;
        animalExplicito.emiteSonido();


        //otro ejemplosout
        System.out.println("Ejemplo instance of");
       Animal miAnimal= new Gato();
       if(miAnimal instanceof Perro) {
           Perro perro1 = (Perro) miAnimal;
           perro1.emiteSonido();
       }else{
           System.out.println("estamos casteando mal");
       }

       //CASTEAMOS MAS
        System.out.println("casteando variables");
       double numeroDouble = 10.5;
       int numeroEntero= (int) numeroDouble; //--> casting explicito
        System.out.println("numero double: "+numeroDouble+" numero entrero: "+numeroEntero);
        System.out.println("Double a String");
        String numeroString = Double.toString(numeroDouble);
        System.out.println(numeroString);
        //casting de String a Integer
        String numeroString2= "123";
        int numeroAConvertir= Integer.parseInt(numeroString2);
        System.out.println(numeroAConvertir);
    }
}
