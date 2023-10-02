public class Residencia {
    String direccion;
    int capacidadMax;
    int habitacionesDispo;
    double precioMensual;

    public Residencia() {
        direccion = "direccion1";
        capacidadMax = 20;
        habitacionesDispo = capacidadMax;
        precioMensual = 300.50;
    }

    public void alquilarHabitacion(int cantEstudiantes) {
        if (cantEstudiantes <= habitacionesDispo) {
            habitacionesDispo-= cantEstudiantes;
            System.out.println(cantEstudiantes + " habitaciones alquiladas con éxito.");
        } else {
            System.out.println("No hay suficientes habitaciones disponibles para alquilar.");
        }
    }

    public void desocuparHabitacion(int cantEstudiantes) {
        if (capacidadMax - habitacionesDispo >= cantEstudiantes) {
            habitacionesDispo += cantEstudiantes;
            System.out.println(cantEstudiantes + " habitaciones desocupadas con éxito.");
        } else {
            System.out.println("No es posible desocupar esta cantidad de habitaciones.");
        }
    }

    public String getDireccion() {
        return direccion;
    }
    public int getHabitacionesDispo() {
        return habitacionesDispo;
    }

    public void setPrecioMensual(double precioMes) {
        precioMensual = precioMes;
    }
}
