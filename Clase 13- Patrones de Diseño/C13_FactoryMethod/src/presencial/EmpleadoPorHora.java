package presencial;

public class EmpleadoPorHora extends Empleado{
    private double importePorHora;
    private double retencionImpuesto;

    @Override
    public double calcularSueldo(int dias) {
        double salario= (importePorHora*dias)-retencionImpuesto;
        return salario;
    }

    public EmpleadoPorHora(double importePorHora, double retencionImpuesto) {
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }
}
