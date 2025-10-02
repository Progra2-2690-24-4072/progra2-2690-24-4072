/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg2;

/**
 *
 * @author crist
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        Transaccion t1 = new Transaccion(100.0);
        t1.procesarPago();

        PagoTarjeta t2 = new PagoTarjeta(250.0, "1234-5678-9012-3456");
        t2.procesarPago();
    }
}

