public class Nomina extends Tarjeta
{
    private Descuento platino;

    public Nomina(String numeroDeCuenta, double valorApertura){
        super(numeroDeCuenta,valorApertura);
        this.platino = platino;
    }
    
    public double cuotaDeManejo(){
        if (platino != null) {
            return 20000 - platino.getValorDescontado(getValorApertura());
        } else {
            // Manejar el caso donde platino es null
            return 20000; // Otra acción apropiada en caso de que basico no esté definido.
        }
    }
}
