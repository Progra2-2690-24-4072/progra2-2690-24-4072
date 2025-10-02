/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author crist
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo (double radio)
    {
        this.radio = radio;
        
    }
    public static double pi = 3.1416;
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area (){
        return pi * (radio * radio);
    }
    
}
