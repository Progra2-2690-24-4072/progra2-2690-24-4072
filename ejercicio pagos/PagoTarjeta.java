/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.pkg2;

/**
 *
 * @author crist
 */
public class PagoTarjeta extends Transaccion {
    private String numeroTarjeta;

    public PagoTarjeta(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago de Q" + monto + " con tarjeta: " + numeroTarjeta);
    }
}

