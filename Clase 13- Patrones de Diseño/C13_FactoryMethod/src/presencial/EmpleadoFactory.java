package presencial;

public class EmpleadoFactory {
  public static Empleado crearEmpleado(String tipo){
      if("EMP-RD".equalsIgnoreCase(tipo)){
          return new EmpleadoEnRelacionDependencia(1000.0);
      } else if ("EMP-PH".equalsIgnoreCase(tipo)) {
          return new EmpleadoPorHora(7,14);
                }else{
          throw new IllegalArgumentException("Tipo de Empleado no valido: "+tipo);
      }
  };
}
