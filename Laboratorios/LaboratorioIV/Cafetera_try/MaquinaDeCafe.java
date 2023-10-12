public class MaquinaDeCafe
{
    //Asumimos que es cafe instantaneo
    private Integer nivel; //Nivel de cafe que tiene la maquina actual
    private Integer nivelMax; // Nivel de cafe maximo
    private Integer saldo; //Saldo de la maquina para vueltos
    private Integer valorOnza;
    private Integer onzasDeVenta; //onzas pedidas por usuario 
    private Integer dineroRecibido; // dinero suministrado por usuario

    public MaquinaDeCafe(){
        nivel=100;
        saldo=20000;
        valorOnza=100;         
    }

    public MaquinaDeCafe(Integer nivel, Integer nivelMax, Integer saldo, Integer valorOnza){
        this.nivel=nivel;
        this.nivelMax =nivelMax;
        this.saldo=saldo;
        this.valorOnza=valorOnza;         
    }

    public Integer getNivel(){return nivel;}

    public Integer getNivelMax(){return nivelMax;}

    public Integer getSaldo(){return saldo;}

    public Integer getValorOnza(){return valorOnza;}

    public void pedirCafe(Integer unidades) throws NivelInsuficiente{
        if(unidades>nivel){
            throw new NivelInsuficiente("Café insuficiente Recargue");
        }else{
            onzasDeVenta=unidades;
        }
    }

    public void recibirDinero(Integer dinero){
        dineroRecibido=dinero;
    }

    public Integer cacularPrecio() throws DineroInsuficiente{
        Integer precio = onzasDeVenta*valorOnza;
        if (precio > dineroRecibido){
            throw new  DineroInsuficiente("Dinero ingresado insuficiente para la compra, intente de nuevo"); //No le alcanza para comprar
        }else{
            return precio;
        }   
    } 

    public Integer calcularCambio() throws DineroInsuficiente {
        Integer cambio = dineroRecibido-cacularPrecio();
        if(cambio>saldo){
            throw new  DineroInsuficiente("La maquina no puede darle cambio, intente con otro billete"); 
        }
        return cambio;
    }

    public void entregarCafe() throws DineroInsuficiente {
        if (calcularCambio() >= 0){
            nivel-=onzasDeVenta;
            saldo+=cacularPrecio();
            onzasDeVenta=0;
            dineroRecibido=0;
        }
    }

    public void recargarNivel(Integer onzasAgregar) throws NivelDeCafeMaximo {
        Integer recarga = nivel + onzasAgregar;
        if (recarga > nivelMax){
            throw new NivelDeCafeMaximo("Maquina llena no Recargar");
        }
        nivel += onzasAgregar;
    }

}