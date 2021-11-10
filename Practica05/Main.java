// Importar la biblioteca Scanner para que el usuario pueda introducir los números
import java.util.Scanner;
/**
 * Clase Main que representa una cuenta bancaria del titular y su salario
 * @author Javier Alejandro Mancera Quiroz 
 * @version 1.0
 * */
public class Main{
    /**
     * Metodo principal main para poder ejecutar la clase Main
     * y ocupar lo metodos de la clase Cuenta 
     * @param args Los argumentos
     * */
    public static void main(String[] args){

	// Se crea un objeto llamado 'usuario' de la clase Cuenta, con el metodo que no tiene parametros
	Cuenta usuario = new Cuenta();

	// Imprime el titular: "Javier Mancera" 
	System.out.println("Titular: "+ usuario.getTitular());
	// Imprime el dinero disponible: "200"
	System.out.println("Efectivo disponible: "+ usuario.getDinero());

	// Se crea un objeto llamado 'usuario2' de la clase Cuenta, con el metodo que tiene parametros
	Cuenta usuario2 = new Cuenta("Mauricio");

	// Imprime el nombre del titular dado por el usuario 
        System.out.println("Titular: "+ usuario2.getTitular());
	// Imprime el dinero disponible: "0"
	System.out.println("Efectivo disponible: "+ usuario2.getDinero());

	// Imprime el nombre del titular y el dinero disponible del 'usuario'
	System.out.println(usuario);
	// Imprime el nombre del titular y el dinero disponible del 'usuario2'
	System.out.println(usuario2);
	
    } // Cierre del metodo main
} // Cierre de la clase Main
