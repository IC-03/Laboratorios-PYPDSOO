public class Impresora {
    String modelo;
    boolean encendida;
    int hojasDisponibles;
    String tipoConexion;

    public Impresora() {
        modelo = "LG";
        tipoConexion = "Internet";
        encendida = false;
        hojasDisponibles = 0;
    }

    public void encender() {
        if (encendida==false) {
            encendida = true;
            System.out.println("Impresora encendida.");
        } else {
            System.out.println("La impresora ya está encendida.");
        }
    }

    public void apagar() {
        if (encendida==true) {
            encendida = false;
            System.out.println("Impresora apagada.");
        } else {
            System.out.println("La impresora ya está apagada.");
        }
    }

    public void ponerPapel(int cantidadHojas) {
        if (encendida==true) {
            hojasDisponibles += cantidadHojas;
            System.out.println("Se han puesto " + cantidadHojas + " hojas de papel.");
        } else {
            System.out.println("Enciende la impresora.");
        }
    }

    public void imprimir(String documento) {
        if (encendida==true && hojasDisponibles > 0) {
            System.out.println("Imprimiendo documento: " + documento);
            hojasDisponibles--;
        } else if (encendida==false) {
            System.out.println("Enciende la impresora para imprimir.");
        } else {
            System.out.println("No hay suficiente papel para imprimir.");
        }
    }

}
