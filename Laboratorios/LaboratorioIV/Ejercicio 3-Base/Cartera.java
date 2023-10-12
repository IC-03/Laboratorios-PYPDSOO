import java.util.ArrayList;
import java.util.List;
public class Cartera implements PatronCartera
{
    private String mes;
    private List<Tarjeta> tarjetas;

    public Cartera(String mes){
        this.mes = mes;
        this.tarjetas = new ArrayList<>();
    }

    public void imprimirListaDeTarjetas(){
        System.out.println("*****Balance de " + mes + "******");
        for (Tarjeta tarjeta : tarjetas) {
            System.out.println(tarjeta.toString());
        }
    }

    public void agregarTarjeta(Tarjeta t){
        tarjetas.add(t);
    }
}
