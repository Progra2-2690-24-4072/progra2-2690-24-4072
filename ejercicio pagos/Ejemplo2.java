
package ejemplo.pkg2;

public class Ejemplo2 {
    public static void main(String[] args) {
        Transaccion t1 = new Transaccion(100.0);
        t1.procesarPago();

        PagoTarjeta t2 = new PagoTarjeta(250.0, "1234-5678-9012-3456");
        t2.procesarPago();
    }
}


