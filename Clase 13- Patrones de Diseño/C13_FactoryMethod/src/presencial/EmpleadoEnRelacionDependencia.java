package presencial;

public class EmpleadoEnRelacionDependencia extends Empleado {
    private  double sueldoMensual; //30 dias para el mes

    @Override
    public double calcularSueldo(int dias) {
        double proporcionalSalario= sueldoMensual/30;
        double salario= proporcionalSalario*dias ; //acordamos que era proporcional
        return salario;
    }

    public EmpleadoEnRelacionDependencia(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
