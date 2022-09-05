package empleados;
import Personas.ClsPersona;

import java.util.List;

public class ListaEmpleadosImpl implements ListaEmpleados{
    @Override
    public void agregarEmpleado(String nombre_empleado, String nombreArchivo) {
        ClsPersona empleado = new ClsPersona(nombre_empleado);

        try {
            ClsPersona.llenar_informacion(empleado,nombreArchivo);
        } catch (Exception e) {
            System.out.println("Error al acceder a los datos.");
        }
    }

    @Override
    public void listarEmpleados(String nombreArchivo) {
        try {
            List<ClsPersona> Usuario = ClsPersona.listar(nombreArchivo);
            System.out.println("==== Listar Empleados ====");
            for (ClsPersona empleado : Usuario){
                System.out.println("Empleado : "+empleado);
            }
        }catch (Exception e){
            System.out.println("Clavos con el acceso a datos.");
        }
    }
}
