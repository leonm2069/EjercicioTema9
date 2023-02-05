package ejerciciotema9;

public class Trabajador extends Persona{
    private int salario;
    
    public Trabajador (int edad, String nombre, long telefono, int salario){
        super(edad, nombre, telefono);
        this.salario = salario;
    }


}
