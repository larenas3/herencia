
/**
 * Clase padre que describe de forma generica un vehiculo de transporte
 * y sus funciones
 * 
 * @author Lida Heliana Arenas Mogollón
 * @version 11-08-2017
 */
public class Vehiculo
{
    //Atributos
    private int numRuedas;
    private int numPasajeros;
    private double volumenTanque;
    private double kilometraje;
    private String serieMotor;
    private String serieChasis;
    private String tipoCombustible;
    private String placa;
    
    /**
     * Método constructor de la clase Vehiculo
     *
     * @param ruedas Cantidad de ruedas del vehículo.
     * @param pasajeros Cantidad de pasajeros que puede transportar.
     * @param capTanque Capacidad en galones del tanque de combustible.
     * @param kilometraje Kilometros que ha recorrido.
     * @param serieM Serial del motor.
     * @param serieC Serial del chasis.
     * @param tipoComb Tipo de combustible que usa.
     */
    public Vehiculo(int ruedas, int pasajeros, double capTanque,
        double kilometraje, String tipoComb)
    {
        this.numRuedas = ruedas;
        this.numPasajeros = pasajeros;
        this.volumenTanque = capTanque;
        this.kilometraje = kilometraje;
        this.tipoCombustible = tipoComb;
    }

    public void acelerar(){}
    
    public void frenar(){}
    
    public double obtenerVelocidad(){
        double velocidad = 0.0;
        //Codigo que calcula la velicidad del vehiculo
        return velocidad;
    }
    
    public void giroIzquierda(){}

    public void giroDerecha(){}
    
    public double obtenerCombustibleDisponible(){
        double cantidadCombustible = 0.0;
        //Código que calcula la cantidad de combustible restante
        return cantidadCombustible;
    }
    
    public double obtenerKilometraje(){
        return kilometraje;
    }
    
    public void asignarPlaca(String placa){
        this.placa = placa;
    }
}
