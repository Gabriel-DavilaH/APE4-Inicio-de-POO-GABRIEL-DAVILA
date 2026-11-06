class Prestamo {
    Usuario usuario; LibroBib libro;
    Prestamo(Usuario usuario, LibroBib libro) { this.usuario = usuario; this.libro = libro; }
    void registrar() {
        if (libro.prestar()) System.out.println(usuario.nombre + " prestó '" + libro.titulo + "' - EXITO");
        else System.out.println(usuario.nombre + " no pudo prestar '" + libro.titulo + "' - NO DISPONIBLE");
    }
}
