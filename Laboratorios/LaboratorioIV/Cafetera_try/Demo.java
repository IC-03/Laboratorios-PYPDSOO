import java.util.Scanner;

public class Demo
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        MaquinaDeCafe cafetera = new MaquinaDeCafe(9, 150, 30000, 300);
        System.out.printf("\n digite el dinero que ingresará ");
        int din = scan.nextInt();
        cafetera.recibirDinero(din);
        System.out.printf("\n digite el numero de onzas que desea ");
        int onz  = scan.nextInt();
        try{cafetera.pedirCafe(9);}
        catch (NivelInsuficiente ni){ni.printStackTrace();}
        
        try{ cafetera.cacularPrecio();}
        catch (DineroInsuficiente di){di.printStackTrace();}
        
        try{cafetera.calcularCambio();}
        catch (DineroInsuficiente di){di.printStackTrace();}
        
        try{cafetera.entregarCafe();}
        catch (DineroInsuficiente di){di.printStackTrace();}
    }
}
