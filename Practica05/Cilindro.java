/**
 * Clase Cilindro que representa el area y el volumen de un cilindro
 * @author Javier Alejandro Mancera Quiroz 
 * @version 1.0
 * */
public class Cilindro{
    /**
     * Metodo principal main para sacar el area y el volumen de un cilindro  
     * @param args Los argumentos
     * */
    public static void main(String[] args){

	// El radio de la base del cilindro, con valor de 10
	int radio = 10;
	// La altura del cilindro, con valor de 20
	int altura = 20;
	// El área y volumen del cilindro
	double area,volumen;

	// Sacar el área del cilindro de acuerdo a los valores iniciales de radio y altura
	area = (2*3.1416*radio*altura) + (2*3.1416*radio*radio);
	// Sacar el volumen del cilindro de acuerdo a los valores iniciales de radio y altura
	volumen = 3.1416*radio*radio*altura;

	// Imprime: "***Área y volumen de un cilindro***"
	System.out.println("***Área y volumen de un cilindro***");
	// Imprime el resultado del área del cilindro en cm²
	System.out.println("El área del cilindro es: "+ area+ " cm²");
	// Imprime el resultado del volumen del cilindro en cm³
	System.out.println("El volumen del cilindro es: "+ volumen+ " cm³");
    } // Cierre del método main
} // Cierre de la clase Cilindro
