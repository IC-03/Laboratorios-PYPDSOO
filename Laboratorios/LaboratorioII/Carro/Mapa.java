public class Mapa {
    private String nombre;
    private Ruta ruta;

    public Mapa(String nombre, Ruta ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void mostrarMapa() {
        System.out.println("Mapa: " + nombre);
        if (ruta != null) {
            System.out.println("Ruta: ");
            ruta.imprimirRuta();
        } else {
            System.out.println("No hay una ruta en este mapa.");
        }
    }
}