public class Ejercicio3 {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Max", "Perro", 4, 25.5);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.2);
        Mascota m3 = new Mascota("Rocky", "Perro", 6, 22.0);

        Mascota[] mascotas = {m1, m2, m3};

        for (Mascota m : mascotas) {
            System.out.print(m.nombre + " : " + m.especie
                    + " : " + m.peso);

            if (m.peso > 20) {
                System.out.print(" - Revisar peso");
            }

            System.out.println();
        }

        Mascota m4 = m1;
        m4.edad++;

        System.out.println("Edad de m1: " + m1.edad);

    }
}
