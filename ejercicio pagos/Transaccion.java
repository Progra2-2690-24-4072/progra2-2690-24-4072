
package ejemplo.pkg2;

public class Transaccion {
    protected double monto;

    public Transaccion(double monto) {
        this.monto = monto;
    }

    public void procesarPago() {
        System.out.println("Procesando pago de: Q" + monto);
    }
}


