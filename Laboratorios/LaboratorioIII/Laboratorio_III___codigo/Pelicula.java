public class Pelicula extends MaterialDigital {
    private String director;
    private int duracionMinutos;

    public Pelicula(String titulo, String director, String idioma, int anhoPublicacion, String formato, int duracionMinutos) {
        super(titulo, "Desconocido", idioma, anhoPublicacion, formato);
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }
}
