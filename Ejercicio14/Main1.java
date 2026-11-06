public class Main1 {
    public static void main(String[] args) {
        Autor a1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("Isabel Allende", "Chilena");
        Libro l1 = new Libro("Cien años de soledad", 1967, a1);
        Libro l2 = new Libro("La casa de los espíritus", 1982, a2);
        l1.mostrarInformacion();
        l2.mostrarInformacion();
    }
}
