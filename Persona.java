package Ejemploo;
public class Persona {
    private String nombre;
    protected int edad;
    String genero;
    public String pais;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, String genero, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pais = pais;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre );
        System.out.println("Edad: "+this.edad );
        System.out.println("Genero: "+this.genero);
        System.out.println("Pais: "+this.pais);
    }
    
}
