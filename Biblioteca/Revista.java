public class Revista extends MaterialFisico {
    private String edicion;

    public Revista(String titulo, String autor, String idioma, 
    int anhoPublicacion, int numeroPaginas, int cantDisponible, String edicion) {
        super(titulo, autor, idioma, anhoPublicacion, numeroPaginas, cantDisponible); 
        this.edicion = edicion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Edición: " + edicion);
    }
}
