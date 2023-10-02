public class Escuela
{
    private String nombre;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    public Escuela(String nombre){
        this.nombre=nombre;
        estudiantes= new Estudiante[200];
        cantidadEstudiantes=0;
    }

    public void agregarEstudiante(Estudiante e){
        estudiantes[cantidadEstudiantes]=e;
        cantidadEstudiantes= cantidadEstudiantes+1;   
    }

    public void imprimirNivel(int lvl){
        for(int i =0; i<cantidadEstudiantes;i++){
            Estudiante e= estudiantes[i];
            if(e.getNivel()==lvl){
                System.out.println("Los datos del estudiante " + i + " :" );
                System.out.println("Nombre:" + e.getNombre() + 
                "\nNivel: " + e.getNivel() + "\nDireccion: " 
                + e.getDir().getTexto() + " " + e.getDir().getBarrio()
                + " " + e.getDir().getCiudad() );
            }
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
