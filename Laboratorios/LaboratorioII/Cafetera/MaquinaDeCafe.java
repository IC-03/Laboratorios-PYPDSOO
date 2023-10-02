public class MaquinaDeCafe
{
    //Asumimos que es cafe instantáneo
    private int nivel; //Nivel de cafe que tiene la maquina
    private int saldo; //Saldo de la máquina para vueltos
    private int valorOnza;
    private int unidadesDeVenta;
    private int dineroRecibido;

    MaquinaDeCafe(){
        nivel=100;
        saldo=20000;
        valorOnza=100;         
    }

    int cacularPrecio(){
        int precio = unidadesDeVenta*valorOnza;
        if (precio > dineroRecibido){
            return dineroRecibido = 0; //No le alcanza para comprar
        }
        else {
            return precio;
        }
    } 

    void entregarCafe(){
        if (calcularCambio() != 0){
            nivel-=unidadesDeVenta;
            saldo+=cacularPrecio();
            unidadesDeVenta=0;
            dineroRecibido=0;
        }
    }

    int calcularCambio(){
        int cambio = dineroRecibido-cacularPrecio();
        if(cambio>saldo){
            return dineroRecibido = 0;
        }
        else {
            return cambio;
        }
    }

    void recibirCantidadOnzas(int unidades){
        unidadesDeVenta=unidades;
    }

    void recibirDinero(int dinero){
        dineroRecibido=dinero;
    }

    void recargarNivel(){
        if (nivel <= 100){
            nivel = 100;
        }else{
            System.out.print("Ya la cafetera está en su límite");
        }
    }
}
