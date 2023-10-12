public class Joven extends Tarjeta
{
    private Descuento basico = Descuento.BASICO;

    public Joven(String numeroDeCuenta, double valorApertura){
        super(numeroDeCuenta,valorApertura);
        this.basico = basico;
    }

    public double cuotaDeManejo(){
        return Math.round(20000 - basico.getValorDescontado(getValorApertura()));
    }
}
