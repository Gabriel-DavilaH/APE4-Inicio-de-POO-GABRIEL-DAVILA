class Producto {
    String nombre; double precio; int stock;
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre; this.precio = precio; this.stock = stock;
    }
    void reducirStock(int cantidad) {
        if (stock >= cantidad) stock -= cantidad;
        else System.out.println("Stock insuficiente.");
    }
    void mostrarProducto() {
        System.out.println(nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}
