package practica;

import java.time.LocalDate;

public class Paciente {
    private String nombre, apellido;
    private String cedula;
    private LocalDate fechaInternacion;
    private LocalDate fechadeAlta;

    public Paciente(String nombre, String apellido, String cedula, LocalDate fechaInternacion) throws FechaInternacionInvalidException {
        if(fechaInternacion.isAfter(LocalDate.now())){
            throw new FechaInternacionInvalidException();
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaInternacion = fechaInternacion;
    }
    public void darDeAlta(LocalDate fechadeAlta) throws FechaAltavalidException{
        if(fechadeAlta.isBefore(fechaInternacion)){
            throw new FechaAltavalidException();
        }
        this.fechadeAlta= fechadeAlta;
    }
}
