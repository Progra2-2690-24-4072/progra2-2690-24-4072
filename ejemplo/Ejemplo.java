/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

/**
 *
 * @author crist
 */
public class Ejemplo {

    public static void main(String[] args) {
        System.out.println(Circulo.pi);
        Circulo c1 = new Circulo (32);
        System.out.println(c1.area());
        c1.setX(10);
        c1.setY(2);
        
    }
}
