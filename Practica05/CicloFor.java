/**
 * Clase CicloFor que representa los números primos con un cierto límite 
 * @author Javier Alejandro Mancera Quiroz 
 * @version 1.0
 * */
public class CicloFor{
    /**
     * Metodo principal main para poder ejecutar el ciclo for para calcular 
     * los numeros primos 
     * @param args Los argumentos
     * */
    public static void main (String[] args){

	// Las variables 'i' y 'j', de tipo entero
	int i,j;
	// Variable 'esPrimo' de tipo booleano 
	boolean esPrimo;
	
	// Un ciclo for que le asigna un valor de 2 a la variable 'i', que 
	// sea igual o menor a 1000 sino ya no entra al ciclo y que al
	// termino del código que contiene este ciclo
	// ir agregando un valor más 1 a 'i'
	for(i = 2;i <= 1000;i++){
	    // Asignar a 'esPrimo' un valor verdadero
	    esPrimo=true;
	    
	    // Otro ciclo for que le asigna un valor de 2 a la variable 'j', que 
	    // sea menor al valor de 'i' sino ya no entra al ciclo y que al
	    // termino del código que contiene este ciclo
	    // ir agregando un valor 1 más a 'j'
	    for(j = 2;j < i;j++){
		
		// Si i es divisible entre j
		if(i % j == 0){
		    // Entonces cambiar el valor de 'esPrimo' por falso
		    esPrimo = false;
		} // Cierre de la condicional
	    } // Cierre del ciclo for
	    // Si 'esPrimo' es verdadero
	    if(esPrimo){
		// Entonces imprime el valor de 'i'
		System.out.println(i);
	    } // Cierre de la condicional
	} // Cierre del ciclo for
    } // Cierre del método main
} // Cierre de la clase CicloFor
