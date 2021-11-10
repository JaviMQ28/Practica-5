/**
 * Clase CicloWhile que representa los números primos con un cierto límite 
 * @author Javier Alejandro Mancera Quiroz 
 * @version 1.0
 * */
public class CicloWhile{
    /**
     * Metodo principal main para poder ejecutar el ciclo while para calcular 
     * los numeros primos 
     * @param args Los argumentos
     * */
    public static void main ( String[] args){
	
	// Asignar al entero 'i' el valor de 2
	int i = 2;
	// Asignar al entero 'j' el valor de 2
	int j = 2;
	// Variable 'esPrimo' de tipo booleano
	boolean esPrimo;

	// Un ciclo while que recibe una condición, que 'i' sea menor a 1000, y que mientras se cumpla
	// no se va a salir del ciclo
	while ( i < 1000 ){
	    // Asignar 'esPrimo' un valor verdadero
	    esPrimo = true;

	    // Un ciclo while que recibe una condición, que 'j' sea menor a 'i', y que mientras se cumpla
	    // no se va a salir del ciclo
	    while ( j < i ){

		// Si 'i' es divisible entre 'j'
		if ( i % j == 0 ){
		    // Entonces cambiar el valor de 'esPrimo' por falso
		    esPrimo = false;
		    // Y salirse del ciclo while
		    break;
		} // Cierre de la condicional
		
		// Agregar a 'j' un valor 1 
		j++;
	    } // Cierre del ciclo while

	    // Si 'esPrimo' es verdadero
	    if ( esPrimo ){
		// Entonces imprime el valor de 'i'
		System.out.println(i);
	    } // Cierre de la condicional

	    // Agregar a 'i' un valor 1 
	    i++;
	    // Volver a asignar a 'j' el valor de 2
	    j = 2;
	} // Cierre del ciclo while
    } // Cierre del método main
} // Cierre de la clase CicloWhile
