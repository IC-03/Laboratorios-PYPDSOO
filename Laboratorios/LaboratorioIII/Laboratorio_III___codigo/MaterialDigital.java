public class MaterialDigital extends MaterialBiblioteca {
    private String formato;

    public MaterialDigital(String titulo, String autor, String idioma, int anhoPublicacion, String formato) {
        super(titulo, autor,idioma, anhoPublicacion);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Formato: " + formato);
    }
}