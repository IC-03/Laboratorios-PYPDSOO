public class Nomina extends Tarjeta
{
    private Descuento platino = Descuento.PLATINO;

    public Nomina(String numeroDeCuenta, double valorApertura){
        super(numeroDeCuenta,valorApertura);
        this.platino = platino;
    }

    public double cuotaDeManejo(){
        return  Math.round(20000 - platino.getValorDescontado(getValorApertura()));
    }
}
