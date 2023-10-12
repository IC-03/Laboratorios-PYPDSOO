public enum Descuento
{
    BASICO(0.08f),  //tarjeta joven
    PLATINO(0.12f), //tarjeta nomina
    DIAMANTE(0.15f); //tarjeta visa
    
    private float porcentaje;
    
    private Descuento(float porcentaje){
        this.porcentaje = porcentaje;
    }
    
    public double getValorDescontado(double monto){
        return monto * porcentaje;
    }
}
