public class Main5 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Adrián", "0501234567");
        Usuario u2 = new Usuario("Ariel", "0507654321");
        LibroBib libro = new LibroBib("Algoritmos en Java");
        new Prestamo(u1, libro).registrar();
        new Prestamo(u2, libro).registrar();
    }
}
