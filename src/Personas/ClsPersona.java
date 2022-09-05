package Personas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClsPersona implements IPersona {
    private String nombre;
    public ClsPersona(String nombre_empleado){
        this.setNombre(nombre_empleado);
    }
    @Override
    public String getNombre(String nombre) {
        return null;
    }

    @Override
    public void setNombre(String nombre) {

    }

    public static List<ClsPersona> listar(String nombreArchivo) {
        List<ClsPersona> ListaPersonas = new ArrayList<>();
        try {
            BufferedReader entrada = null;
            File archivo = new File(nombreArchivo);
            entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null){
                ClsPersona persona = new ClsPersona(linea);
                ListaPersonas.add(persona);
                linea = entrada.readLine();
            }
            entrada.close();
        }catch (FileNotFoundException ex){
            System.out.println("No se encuentra el archivo.");
        }catch (IOException ex){
            System.out.println("Hay unos pedillos al abrir el archivo");
        }
        return ListaPersonas;
    }


    public static void llenar_informacion(ClsPersona persona, String nombreArchivo) {
        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter(new FileWriter(archivo));
            salida.println(persona.toString());
            salida.close();
            System.out.println("Se ha escrito el registro de empleado.");
        }catch (IOException ex){
            System.out.println("Hubieron clavos");
        }
    }

    @Override
    public void Cargar_información(String nombreArchivo) {

    }

    @Override
    public void guardar_información(String nombreArchivo) {
        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        }catch (IOException ex){
            System.out.println("Problema al crear el archivo "+ex.getMessage());
        }
    }

}
