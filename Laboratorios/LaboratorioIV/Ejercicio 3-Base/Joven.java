public class Joven extends Tarjeta
{
    private Descuento basico;

    public Joven(String numeroDeCuenta, double valorApertura){
        super(numeroDeCuenta,valorApertura);
        this.basico = basico;
    }

    public double cuotaDeManejo(){
        if (basico != null) {
            return 20000 - basico.getValorDescontado(getValorApertura());
        } else {
            // Manejar el caso donde basico es null
            return 20000; // Otra acción apropiada en caso de que basico no esté definido.
        }
    }
}
