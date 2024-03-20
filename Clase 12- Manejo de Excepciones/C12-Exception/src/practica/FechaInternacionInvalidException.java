package practica;

public class FechaInternacionInvalidException extends Exception{

    public FechaInternacionInvalidException() {
        super("La fecha de internacion no puede ser posterior a la fecha de internacion");
    }
}
