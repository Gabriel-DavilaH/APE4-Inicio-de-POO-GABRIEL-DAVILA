public class Main4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Paulo", 1000);
        Cuenta c2 = new Cuenta("Mateo", 200);
        c1.transferir(c2, 300); // valida
        c1.transferir(c2, 2000); // falla
        c1.mostrar(); c2.mostrar();
    }
}
