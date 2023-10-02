public class Color {
    private int rojo;
    private int azul;
    private int verde;

    public Color(int rojo, int verde ,int azul) {
        this.rojo = rojo;
        this.azul = azul;
        this.verde = verde;
    }

    public int getRojo(){
        return rojo;
    }

    public int getVerde(){
        return verde;
    }

    public int getAzul(){
        return azul;
    }

    public void setRojo( int rojo){
        this.rojo = rojo;
    }

    public void setVerde(int verde){
        this.verde = verde;
    }

    public void setAzul(int azul){
        this.azul = azul;
    }
}