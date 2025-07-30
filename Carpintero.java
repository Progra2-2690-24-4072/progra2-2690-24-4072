package Ejemploo;
public class Carpintero extends Persona {
    private double salario;
    
    public Carpintero(String nombre, int edad, String genero, String pais, double salario) {
        super(nombre, edad, genero, pais);
        this.salario = salario;
    }
    
    public void mostrarInfoC(){
        System.out.println("Salario "+salario);
        mostrarInfo();
        
    }
}
