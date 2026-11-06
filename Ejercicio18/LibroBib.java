class LibroBib {
    String titulo; boolean disponible = true;
    LibroBib(String titulo) { this.titulo = titulo; }
    boolean prestar() {
        if (disponible) { disponible = false; return true; }
        return false;
    }
    void devolver() { disponible = true; }
}
