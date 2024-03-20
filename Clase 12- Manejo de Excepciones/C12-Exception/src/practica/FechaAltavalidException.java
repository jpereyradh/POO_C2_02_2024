package practica;

public class FechaAltavalidException extends Exception{

    public FechaAltavalidException() {
        super("La fecha de alta no puede ser anterior a la fecha de internacion");
    }
}
