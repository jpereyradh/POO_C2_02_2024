package practica;

import java.time.LocalDate;

public class Cliente {
    public static void main(String[] args) {
        try{
            LocalDate fechaInternacion= LocalDate.of(2024,9,10);
            Paciente paciente= new Paciente("Max","Powel","1111",fechaInternacion);
            System.out.println("Paciente creado");

            LocalDate fechaAlta= LocalDate.of(2023,10,5);
            paciente.darDeAlta(fechaAlta);

        }catch (FechaInternacionInvalidException e){
            System.err.println(e.getMessage());
        }catch (FechaAltavalidException fa){
            System.err.println("error: "+fa.getMessage());
        }
    }
}
