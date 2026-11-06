class Venta {
    int cantidad;
    Venta(int cantidad) { this.cantidad = cantidad; }
    void aplicar(Producto producto) {
        if (producto.stock >= cantidad) {
            producto.reducirStock(cantidad);
            System.out.println("Venta: " + cantidad + " x " + producto.nombre + " | Total: $" + (producto.precio * cantidad));
        } else {
            System.out.println("Stock insuficiente.");
        }
        producto.mostrarProducto();
    }
}
