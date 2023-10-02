
public class Ruta
{
    private int id;
    private String[] paradas= new String[100];
    private static int cantidadParadas;

    public Ruta(int id){
        this.id=id;        
        cantidadParadas=0;
    }

    public int getId(){
        return id;
    }

    public String[] getParadas(){
        return paradas;
    }

    public void setId( int id){
        this.id=id;
    }

    public void agregarParada(String parada){
        paradas[cantidadParadas]=parada;
        cantidadParadas++;
    }

    public void imprimirRuta(){
        System.out.println("*********RUTA a seguir**********");
        for(int i=0; i<cantidadParadas ; i++){
            if (paradas[i] != null){
                System.out.println("*--> "+paradas[i]);
            }
        }
    }
}
