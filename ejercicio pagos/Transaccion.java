/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.pkg2;

/**
 *
 * @author crist
 */
public class Transaccion {
    protected double monto;

    public Transaccion(double monto) {
        this.monto = monto;
    }

    public void procesarPago() {
        System.out.println("Procesando pago de: Q" + monto);
    }
}

