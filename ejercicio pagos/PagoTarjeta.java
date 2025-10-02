
package ejemplo.pkg2;

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


