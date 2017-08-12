
/**
 * Clase carro que hereda de la clase Vehiculo
 * 
 * @author Lida Heliana Arenas Mogollón
 * @version 11-08-2017
 */
public class Automovil extends Vehiculo
{
    //Atributos
    public int numEjes;
    
    public int puertas;
    
    public boolean aireAcondicionado;
    
    //Metodos
    /**
     * Constructor for objects of class carro
     */
    public Automovil()
    {
        super(4, 5, 12.0, 0.0, "Gasolina");
    }

    public void desbloquear(){}
    
    public void encenderLimpiabrisas(){}
    
    public void encenderAire(){}
}
