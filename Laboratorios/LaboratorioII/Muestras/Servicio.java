public class Servicio
{
    private Muestra[] msimple;
    private Muestra[] mespecializada;
    private static int cantsimple;
    private static int cantespecializada;
    
    public Servicio(){
        msimple = new Muestra[30];
        mespecializada = new Muestra[30];
        cantsimple = 0;
        cantespecializada = 0;
    }
    
    public void agregarMuestra(Muestra m){
        if (m.getProfundidad()<=10){
            msimple[cantsimple] = m;
            cantsimple += 1;
        }else{
            mespecializada[cantespecializada] = m;
            cantespecializada += 1;
        }
    }
    
    public Muestra[] getMuestrasEspecializadas() {
        return mespecializada;
    }

    public Muestra[] getMuestrasSimples() {
        return msimple;
    }
}
