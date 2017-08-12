
/**
 * La clase moto hereda de la clase Vehiculo
 * 
 * @author Lida Heliana Arenas Mogollon 
 * @version 11-08-2017
 */
public class Moto extends Vehiculo
{
    //Atributos
    private int cilindraje;
    
    //Métodos
    /**
     * Constructor de la clase Moto
     */
    public Moto()
    {
        super(2, 2, 2.5, 0.0, "Gasolina");
    }
    
    public boolean luzEncendida(){
        //Codigo que determina si la luz esta encendida
        return true;
    }
}
