/**
 * Clase Rectangulo que representa las caracteristicas de un rectangulo
 * @author Javier Alejandro Mancera Quiroz 
 * @version 1.0
 * */
public class Rectangulo{

    // Representa la base del rectangulo
    private double base;
    // Representa la altura del rectangulo
    private double altura;

    /**
     * Constructor sin parametros que representa la base y la altura del rectangulo ya con 
     * valores iniciales
     * */
    public Rectangulo(){
	base = 10;
	altura = 5;
    } // Cierre del constructor

    /**
     * Constructor que recibe los valores de la base y la altura de un rectangulo
     * @param base Base del rectangulo
     * @param altura Altura del rectangulo
     * */
    public Rectangulo(double base, double altura){
	this.base = base;
	this.altura = altura;
    } // Cierre del constructor

    /**
     * Metodo que devuelve la base
     * @return Base del rectangulo
     * */
    public double getBase(){
	return this.base;
    } // Cierre del metodo

    /**
     * Metodo que cambia el valor de la base
     * @param base Base del rectangulo
     * */
    public void setBase(double base){
	this.base = base;
    } // Cierre del metodo

    /**
     * Metodo que devuelve la altura
     * @return Altura del rectangulo
     * */
    public double getAltura(){
	return this.altura;
    } // Cierre del metodo

    /**
     * Metodo que cambia el valor de la altura
     * @param altura Altura del rectangulo
     * */
    public void setAltura(double altura){
	this.altura = altura;
    } // Cierre del metodo


    /**
     * Metodo que devuelve la base y la altura, sacando el area del rectangulo
     * @return Area del rectangulo
     * */
    public double getArea(){
	return this.base * this.altura;
    } // Cierre del metodo

    /**
     * Metodo que devuelve la base y la altura, sacando el perimetro del rectangulo
     * @return Perimetro del rectangulo
     * */
    public double getPerimetro(){
	return (this.base * 2) + (this.altura * 2);
    } // Cierre del metodo

    /**
     * Metodo toString para poder representar en forma de texto a 'base', 'altura' y 
     * los resultados del area y del perimetro de un rectangulo, y poder visualizarlo 
     * */
    public String toString(){
	return "Base: "+ base +  " Altura: " + altura + " Área: " + this.base * this.altura + " Perímetro: " + ((this.base * 2) + (this.altura * 2));
    } // Cierre del metodo
} // Cierre de la clase Rectangulo
