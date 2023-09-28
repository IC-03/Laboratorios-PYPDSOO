public class MaterialBiblioteca {
    private String titulo;
    private String autor;
    private String idioma;
    private int anhoPublicacion;

    public MaterialBiblioteca(String titulo, String autor, String idioma, int anhoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.anhoPublicacion = anhoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public String getIdioma() {
        return idioma;
    }
    
    public void setIdioma(String idioma){
        this.idioma = idioma;
    }

    public int getAñoPublicacion() {
        return anhoPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anhoPublicacion);
    }
}
