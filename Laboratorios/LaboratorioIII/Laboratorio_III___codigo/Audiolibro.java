public class Audiolibro extends MaterialDigital {
    private String narrador;

    public Audiolibro(String titulo, String autor, String idioma, int anhoPublicacion, String formato, String narrador) {
        super(titulo, autor, idioma,anhoPublicacion, formato);
        this.narrador = narrador;
    }

    public String getNarrador() {
        return narrador;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Narrador: " + narrador);
    }
}
