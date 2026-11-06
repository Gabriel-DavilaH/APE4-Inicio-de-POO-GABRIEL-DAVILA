public class Main3 {
    public static void main(String[] args) {
        Producto p = new Producto("Laptop", 800, 10);
        new Venta(2).aplicar(p);
        new Venta(20).aplicar(p);
    }
}
