package ejerciciotema9;

public class Persona {
    
    private int edad;
    private String nombre;
    private long telefono;
    
    public Persona (int edad, String nombre, long telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }
  
}
