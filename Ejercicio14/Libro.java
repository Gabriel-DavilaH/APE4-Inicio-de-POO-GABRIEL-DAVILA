class Libro {
    String titulo;
    int anio;
    Autor autor;
    Libro(String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }
    void mostrarInformacion() {
        System.out.println("Título: " + titulo + " | Año: " + anio + " | Autor: " + autor.nombre + " (" + autor.nacionalidad + ")");
    }
}
