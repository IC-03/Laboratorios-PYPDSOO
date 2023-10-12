public class Visa extends Tarjeta
{
    private Descuento diamante;

    public Visa(String numeroDeCuenta, double valorApertura){
        super(numeroDeCuenta,valorApertura);
        this.diamante = diamante;
    }

    public double cuotaDeManejo(){
        if (diamante != null) {
            return 20000 - diamante.getValorDescontado(getValorApertura());
        } else {
            // Manejar el caso donde basico es null
            return 20000; // Otra acción apropiada en caso de que basico no esté definido.
        }
    }
}
