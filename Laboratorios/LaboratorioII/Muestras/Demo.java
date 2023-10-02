public class Demo
{
    public static void main(String[] main){
        Muestra m1 = new Muestra("1",5,"2023");
        Muestra m2 = new Muestra("2",40,"2023");
        Muestra m3 = new Muestra("3",41,"2023");
        Muestra m4 = new Muestra("4",10,"2023");
        Muestra m5 = new Muestra("5",2,"2023");
        Muestra m6 = new Muestra("6",12,"2023");
        Muestra m7 = new Muestra("7",11,"2023");
        
        Servicio s1 = new Servicio();
        Servicio s2 = new Servicio();
        Servicio s3 = new Servicio();
        Servicio s4 = new Servicio();
        Servicio s5 = new Servicio();
        
        Laboratorio l1= new Laboratorio();
        
        l1.agregarServicio(s1);
        l1.agregarServicio(s2);
        l1.agregarServicio(s3);
        l1.agregarServicio(s4);
        l1.agregarServicio(s5);
        
        l1.registrarMuestra(m1, 0);
        l1.registrarMuestra(m2, 0);
        l1.registrarMuestra(m3, 0);
        l1.registrarMuestra(m4, 0);
        l1.registrarMuestra(m5, 1);
        l1.registrarMuestra(m6, 1);
        l1.registrarMuestra(m7, 1);
        
        l1.mostrarInformeLaboratorio();
    }
}
