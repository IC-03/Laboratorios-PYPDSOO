public class MaterialFisico extends MaterialBiblioteca {
    private int numeroPaginas;
    private int cantDisponible;

    public MaterialFisico(String titulo, String autor,String idioma, int anhoPublicacion, 
    int numeroPaginas, int cantDisponible) {
        super(titulo, autor, idioma, anhoPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.cantDisponible = cantDisponible;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    public int getCantDisponible() {
        return cantDisponible;
    }

    public void prestar(){
        if(cantDisponible == 0){
            System.out.println("No hay mas material para prestar");
        } else {
            cantDisponible--;
        }
    }
    
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}