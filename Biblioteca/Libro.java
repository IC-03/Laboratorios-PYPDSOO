public class Libro extends MaterialFisico {
    private String genero;
    private String editorial;

    public Libro(String titulo, String autor, String idioma, int anhoPublicacion, 
    int numeroPaginas, int cantDisponible, String genero, String editorial) {
        super(titulo, autor, idioma, anhoPublicacion, numeroPaginas, cantDisponible);
        this.genero = genero;
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Género: " + genero);
        System.out.println("Idioma: " + editorial);
    }
}