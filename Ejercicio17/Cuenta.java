class Cuenta {
    String titular; double saldo;
    Cuenta(String titular, double saldo) {
        this.titular = titular; this.saldo = saldo;
    }
    void depositar(double m) { saldo += m; }
    boolean retirar(double m) {
        if (saldo >= m) { saldo -= m; return true; }
        return false;
    }
    void transferir(Cuenta destino, double monto) {
        if (retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia exitosa de $" + monto + " de " + titular + " a " + destino.titular);
        } else {
            System.out.println("Transferencia fallida: fondos insuficientes en " + titular);
        }
    }
    void mostrar() { System.out.println(titular + " -> $" + saldo); }
}
