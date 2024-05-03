package tarea6.ed;

public class Tarea6EDClase {

    private static final double DESCUENTO_REDUCIDO = 0.8;
    private static final double DESCUENTO_AMPLIADO = 0.95;

    private void imprimirResultados(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }

    public void aplicarDescuentoEnProductos(double precioProducto, int numProductos) {
        double total;

        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_REDUCIDO;
            imprimirResultados(total);
        } else {
            total = precioProducto * DESCUENTO_AMPLIADO;
            imprimirResultados(total);
        }
    }
}
