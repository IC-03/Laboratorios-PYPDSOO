public class Carro {
    private Color color;
    private String modelo;
    private int anho;
    private double precio;
    private Mapa mapa;

    public Carro(String modelo, int anho, double precio, Color color, Mapa mapa) {
        this.modelo = modelo;
        this.anho = anho;
        this.precio = precio;
        this.mapa = mapa;
        this.color = color;
    }

    public void obtenerRuta() {
        if (mapa != null) {
            mapa.mostrarMapa();
        } else {
            System.out.println("No se encontró una ruta");
        }
    }

    public Color getColor(){
        return color;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAnho(){
        return anho;
    }

    public double getPrecio(){
        return precio;
    }

    public void setColor( Color color){
        this.color = color;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAnho(int anho){
        this.anho = anho;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
}