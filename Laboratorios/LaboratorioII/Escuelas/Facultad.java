public class Facultad
{
    private String nombre;
    private Escuela[] escuelas;
    private int cantidadEscuelas;

    public Facultad(String nombre){
        this.nombre=nombre;
        escuelas= new Escuela[20];
        cantidadEscuelas=0;
    }

    public void agregarEscuela(Escuela e){
        escuelas[cantidadEscuelas]=e;
        cantidadEscuelas= cantidadEscuelas+1;   
    }
    
    public void imprimirEscuelas(){
        for(int i =0; i<cantidadEscuelas;i++){
            Escuela e= escuelas[i];
            System.out.println(e.getNombre());
        }
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }
}
