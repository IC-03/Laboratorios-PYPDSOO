public class Visa extends Tarjeta
{
    private Descuento diamante = Descuento.DIAMANTE;

    public Visa(String numeroDeCuenta, double valorApertura){
        super(numeroDeCuenta,valorApertura);
        this.diamante = diamante;
    }

    public double cuotaDeManejo(){
        return  Math.round(20000 - diamante.getValorDescontado(getValorApertura()));
    }
}
