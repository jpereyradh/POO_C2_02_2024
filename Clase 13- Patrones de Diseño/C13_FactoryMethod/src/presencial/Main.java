package presencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el tipo de empleado (EMP-RD o EMP-PH)");
        String tipoEmpleado= scanner.nextLine();

        Empleado empleado= EmpleadoFactory.crearEmpleado(tipoEmpleado);
        System.out.println("Ingrese la cantidad de dias trabajados: ");
        int dias= scanner.nextInt();

        double sueldo= empleado.calcularSueldo(dias);
        System.out.println("Salario a percibir por el empleado: "+sueldo);

        scanner.close();
    }
}
