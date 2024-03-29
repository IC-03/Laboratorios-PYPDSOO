public class EmpleadoPlanta extends Empleado implements AfiliacionSindical
{
    public EmpleadoPlanta(String nombre, String apellido, float baseSalarial, int anios)
    {
        super(nombre, apellido, baseSalarial, anios);
    }

    @Override
    public double getBonoAntiguedad(){
        if (getAnios() > 10){
            return getBaseSalarial()*0.1;

        } else{
            return getBaseSalarial()*0.05;
        }
    }

    @Override
    public double getAporteASindicato(){
        if (getAnios() > 10){
            return getBaseSalarial()*0.3;

        } else{
            return getBaseSalarial()*0.015;
        }
    }

    @Override
    public double calcularSalario(){
        return 2.5*getBaseSalarial()+getBonoAntiguedad()-getAporteASindicato();
    }

}
