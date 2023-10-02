public class Laboratorio
{
    private Servicio[] servicios;
    private static int cantservicios;

    public Laboratorio(){
        servicios = new Servicio[100];
        cantservicios =0;
    }

    public void agregarServicio(Servicio s){
        servicios[cantservicios] = s;
        cantservicios += 1;
    }

    public void registrarMuestra(Muestra m, int num){
        if (num <0 || num>cantservicios){
            System.out.println("No hay servicio registrado en esa posicion");
        }else{
            servicios[num].agregarMuestra(m);
        }
    }

    public void mostrarInformeLaboratorio(){
        for (int i = 0; i < cantservicios; i++) {
            Muestra[] mespecial= servicios[i].getMuestrasEspecializadas();
            Muestra[] msimple = servicios[i].getMuestrasSimples();
            double sumaSim = 0;
            double sumaEsp = 0;
            double promEsp = 0;
            double promSim = 0;
            int contEsp = 0;
            int contSim = 0;
            for (int j = 0; j < mespecial.length; j++) {
                if (mespecial[j] != null) {
                    sumaEsp += mespecial[j].getProfundidad();
                    contEsp++;
                }
            }
            if(contEsp!=0){promEsp = sumaEsp / contEsp;}
            for (int j = 0; j < msimple.length; j++) {
                if (msimple[j] != null) {
                    sumaSim += msimple[j].getProfundidad();
                    contSim++;
                }
            }
            if(contSim!=0){promSim = sumaSim / contSim;}
            double costo = (contEsp * 1000000) + (contSim*400000);
            System.out.println("***************************************************************************");
            System.out.println("Servicio #"+ i);
            System.out.println("Profundidad promedio de " +contEsp+ " muestras especializadas: " + promEsp);
            System.out.println("Profundidad promedio de " +contSim+ " muestras simples: " + promSim);
            System.out.println("Costo de cada servicio : " + costo);
        }
    }
}

