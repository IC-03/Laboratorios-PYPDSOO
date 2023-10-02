public class Estudiante {
    private String nombre;
    private int nivel;
    private Direccion dir;

    public Estudiante(String nombre, int nivel, Direccion dir) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.dir = dir;
    }

    public void setDir(Direccion d){
        dir=d;
    }

    public int getNivel(){
        return nivel;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Direccion getDir(){
        return dir;
    }
}