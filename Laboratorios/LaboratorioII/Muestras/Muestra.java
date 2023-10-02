public class Muestra
{
    private String serial;
    private int profundidad;
    private String fecha;
    
    public Muestra(){}
    
    public Muestra(String serial, int profundidad, String fecha){
        this.serial = serial;
        if (profundidad>50 || profundidad<0){
            System.out.println("La profundidad de la muestra debe estar entre 0 a 50");
            System.exit(0);
        }else{
            this.profundidad= profundidad;
        }
        this.fecha = fecha;
    }
    
    public String getSerial(){
        return serial;
    }
    
    public void setSerial(String serial){
        this.serial= serial;
    }
    
    public int getProfundidad(){
        return profundidad;
    }
    
    public void setProfundidad(int profundidad){
        if (profundidad>50 || profundidad<0){
            System.out.println("La profundidad de la muestra debe estar entre 0 a 50");
        }else{
            this.profundidad= profundidad;
        }
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha= fecha;
    }
}
