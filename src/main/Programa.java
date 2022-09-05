package main;
import empleados.ListaEmpleados;
import empleados.ListaEmpleadosImpl;

import java.util.Scanner;

public class Programa {
    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "C:\\Users\\Windows 10\\Desktop\\Usuarios.txt";
    private static final ListaEmpleados catalogoEmpleados = new ListaEmpleadosImpl();

    public static void main(String[] args) {
        while (opcion != 0) {
            try {
                System.out.println("Elige opcion: \n1.- Agregar Empleado\n"
                        + "2.- Listar Empleados\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el nombre de un empleado a agregar:");
                        String nombre = scanner.nextLine();
                        catalogoEmpleados.agregarEmpleado(nombre, nombreArchivo);
                        break;
                    case 2:
                        catalogoEmpleados.listarEmpleados(nombreArchivo);
                        break;
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }
}
