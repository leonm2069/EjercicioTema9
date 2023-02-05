package ejerciciotema9;

public class Cliente extends Persona{
    
    private String credito; 
    
    public Cliente (int edad, String nombre, long telefono, String credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
     
    }
    
    public void mostrarDatos (){
        System.out.println("Edad: "+getEdad());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Telefono: "+getTelefono());
        System.out.println("Credito: "+credito);
    }
    
}
