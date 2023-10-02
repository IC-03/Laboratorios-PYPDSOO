public class Direccion {
    private String texto;
    private String barrio;
    private String ciudad;

    public Direccion(String texto, String barrio,String ciudad) {
        this.texto = texto;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    public String getTexto(){
        return texto;
    }

    public String getBarrio(){
        return barrio;
    }

    public String getCiudad(){
        return ciudad;
    }
}