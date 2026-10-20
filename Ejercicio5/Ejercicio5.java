public class Ejercicio5 {
    public static void main(String[] args) {
        Libro l1 = new Libro("Don Quijote", "Cervantes", true);
        Libro l2 = new Libro("El Principito", "Saint-Exupery", true);
        Libro l3 = new Libro("Cien Anos de Soledad",
                "Garcia Marquez", true);
        Libro l4 = new Libro("La Odisea", "Homero", true);

        Socio s1 = new Socio("Ana");
        Socio s2 = new Socio("Luis");

        s1.prestarLibro(l1);
        s1.prestarLibro(l2);

        s2.prestarLibro(l3);

        Libro[] libros = {l1, l2, l3, l4};
        Socio[] socios = {s1, s2};

        int disponibles = 0;

        System.out.println("=== Estado de los libros ===");

        for (Libro l : libros) {
            if (l.disponible) {
                System.out.println(l.titulo + " : Disponible");
                disponibles++;
            } else {
                System.out.println(l.titulo + " : Prestado");
            }
        }

        System.out.println("\n=== Estado de los socios ===");

        for (Socio s : socios) {
            System.out.println(s.nombre + " : "
                    + s.librosPrestados);
        }

        System.out.println("\nLibros disponibles: " + disponibles);
    }
}
