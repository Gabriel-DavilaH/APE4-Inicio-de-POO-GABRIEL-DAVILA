public class Ejercicio2 {
    public static void main(String[] args) {
        Producto p1 = new Producto("Arroz", 1.50, 10);
        Producto p2 = new Producto("Leche", 1.00, 7);
        Producto p3 = new Producto("Azucar", 1.25, 4);
        Producto p4 = new Producto("Aceite", 3.50, 8);

        Producto[] productos = {p1, p2, p3, p4};

        p1.vender(3);
        p2.vender(3);

        double totalInventario = 0;

        for (Producto p : productos) {
            System.out.printf("%s : $%.2f",
                    p.nombre, p.precio);

            if (p.stock < 5) {
                System.out.print(" - Reponer");
            }

            System.out.println(" - Stock: " + p.stock);

            totalInventario += p.precio * p.stock;
        }

        System.out.printf("Valor total del inventario: $%.2f%n",
                totalInventario);
    }
}
