package Personas;

public interface IPersona {
    public String getNombre(String nombre);
    public void setNombre(String nombre);

    public void Cargar_información(String archivo);
    public void guardar_información(String archivo);

}
