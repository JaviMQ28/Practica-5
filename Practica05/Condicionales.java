// Importar la biblioteca Scanner para que el usuario pueda introducir los números
import java.util.Scanner;
/**
 * Clase Condicionales que representa el número con mayor valor 
 * @author Javier Alejandro Mancera Quiroz 
 * @version 1.0
 * */
public class Condicionales{
    /**
     * Metodo principal main para poder ejecutar la condicional if para saber 
     * el número con mayor valor  
     * @param args Los argumentos
     * */
    public static void main(String[] args){

	// Se crea un objeto llamado 'pr' de la clase Scanner
	// System.in - Es la entrada estándar de datos
	Scanner pr = new Scanner(System.in);
	// Imprime: "*** Condicionales ***"
	System.out.println("*** Condicionales ***");
	// Imprime: "Dame el número 1:"	
	System.out.println("Dame el número 1: ");
	// Se lee el número 'x' dado por el usuario, de tipo entero
	int x = pr.nextInt();
	// Imprime: "Dame el número 2:"
	System.out.println("Dame el número 2: ");
	// Se lee el número dado 'y' por el usuario, de tipo entero
	int y = pr.nextInt();
	
	// Si el valor 'x' es mayor que 'y' 
	if ( x>y ){
	    // Entonces imprime: "El número con mayor valor es: " y el valor de 'x' 
	    System.out.println("El número con mayor valor es: "+ x);
	} else {
	    // Sino imprime: "El número con mayor valor es: " y el valor de 'y'
	    System.out.println("El número con mayor valor es: "+ y);
	} // Cierre de la condicional 
    } // Cierre del método main
} // Cierre de la clase Condicionales
