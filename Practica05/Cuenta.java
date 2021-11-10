/**
 * Clase Cuenta que representa una cuenta bancaria del titular y su salario 
 * @author Javier Alejandro Mancera Quiroz 
 * @version 1.0
 * */
public class Cuenta{

    // Representa el titular de la cuenta
    private String titular;
    // Representa el dinero disponible de la cuenta
    private double dineroDisponible;

    /**
     * Constructor sin parametros que representa la cuenta ya con 
     * valores iniciales
     * */
    public Cuenta(){
	titular = "Javier Mancera";
	dineroDisponible = 200;
    } // Cierre del constructor

    /**
     * Constructor que recibe un titular de una cuenta con 
     * dinero disponible de 0
     * @param titular Titular de la cuenta
     * */
    public Cuenta(String titular){
	this.titular = titular;
	this.dineroDisponible = 0;
    } // Cierre del constructor

    /**
     * Metodo que devuelve el titular
     * @return El titular de la cuenta
     * */
    public String getTitular(){
	return this.titular;
    } // Cierre del metodo

    /**
     * Metodo que cambia el nombre del titular
     * @param titular El titular
     * */
    public void setTitular(String titular){
	this.titular = titular;
    } // Cierre del metodo

    /**
     * Metodo que devuelve el dinero disponible
     * @return El dinero disponible
     * */
    public double getDinero(){
	return this.dineroDisponible;
    } // Cierre del metodo

    /**
     * Metodo que cambia el valor del dinero disponible
     * @param dineroDisponible El dinero disponible
     * */
    public void setDinero(double dineroDisponible){
	this.dineroDisponible = dineroDisponible;
    } // Cierre del metodo

    /**
     * Metodo toString para poder representar en forma de texto a 'titular' y 'dineroDisponible'
     * y poder visualizarlo 
     * */
    public String toString(){
	return "Titular: "+ titular + " Efectivo disponible: " + dineroDisponible;
    } // Cierre del metodo
} // Cierre de la clase Cuenta
