
/**
 * Clase Taxi que hereda de la clase Automovil.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taxi extends Automovil
{
    //Atributos
    private String cooperativa;
    private int producidoDia;
    private int taximetro;

    //Metodos
    /**
     * Constructor for objects of class Taxi
     */
    public Taxi()
    {
    }
    
    public void reiniciarTaximetro(){}
    
    public void matricularAcooperativa(String coop){
        this.cooperativa = coop;
    }
}
