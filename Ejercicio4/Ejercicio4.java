public class Ejercicio4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Ana", 200);
        Cuenta c2 = new Cuenta("Luis", 350);

        int meses1 = 0;
        int meses2 = 0;

        System.out.println("=== Cuenta de Ana ===");

        while (c1.saldo < 500) {
            c1.depositar(50);
            meses1++;

            System.out.printf("%s : $%.2f%n",
                    c1.titular, c1.saldo);
        }

        System.out.println("Meses necesarios: " + meses1);

        System.out.println("\n=== Cuenta de Luis ===");

        while (c2.saldo < 500) {
            c2.depositar(50);
            meses2++;

            System.out.printf("%s : $%.2f%n",
                    c2.titular, c2.saldo);
        }

        System.out.println("Meses necesarios: " + meses2);
    }
}
