public class UsoCarro {

    public static void main(String[] args) {
        Color color = new Color(15,15,15);
        Ruta ruta1 = new Ruta(1);
        ruta1.agregarParada("Cabecera");
        ruta1.agregarParada("Estadio");
        ruta1.agregarParada("Uis");
        Mapa mapa1 = new Mapa("Bmanga", ruta1);
        Carro miCarro = new Carro("Toyota", 2023, 25000.0, color, mapa1);
        miCarro.obtenerRuta();
    }
}