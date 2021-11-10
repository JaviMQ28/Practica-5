// Importar la biblioteca Scanner para que el usuario pueda introducir los números
import java.util.Scanner;
/**
 * Clase Bisiesto que representa si el año es bisiesto o no 
 * @author Javier Alejandro Mancera Quiroz 
 * @version 1.0
 * */
public class Bisiesto{
    /**
     * Metodo principal main para poder ejecutar la condicional if - else para saber 
     * si un año es bisiesto o no  
     * @param args Los argumentos
     * */
    public static void main(String[] args){

	// Se crea un objeto llamado 'pr' de la clase Scanner
	// System.in - Es la entrada estándar de datos
	Scanner in = new Scanner(System.in);
	// Imprime: "*** Bisiesto ***"
	System.out.println("*** Bisiesto ***");
	// Imprime: "Ingresa el año del que deseas saber si es bisiesto o no:"
	System.out.println("Ingresa el año del que deseas saber si es bisiesto o no: ");
	// Se lee el año dado por el usuario, de tipo entero
	int año = in.nextInt();

	// Si 'año' es divisible entre 4, si 'año' no es divisible entre 100 o si 'año' es divisible entre 400 
	if ( año % 4 == 0 && año % 100 != 0 || año % 400 == 0 ) {
	    // Entonces imprime el año dado por el usuario y que es bisiesto
	    System.out.println("El año "+ año + " es bisiesto");
	} else {
	    // Sino imprime el año dado por el usuario y que no es bisiesto
	    System.out.println("El año "+ año + " no es bisiesto");
	} // Cierre de la condicional
    } // Cierre del método main
} // Cierre de la clase Condicionales	 
