// Importar la biblioteca Scanner para que el usuario pueda introducir los números
import java.util.Scanner;
/**
 * Clase MainRec que representa las caracteristicas de un rectangulo
 * @author Javier Alejandro Mancera Quiroz 
 * @version 1.0
 * */
public class MainRec{
    /**
     * Metodo principal main para poder ejecutar la clase MainRec
     * y ocupar lo metodos de la clase Rectangulo 
     * @param args Los argumentos
     * */
    public static void main(String[] args){

	// Se crea un objeto llamado 'figura' de la clase Rectangulo, con el metodo que no tiene parametros
	Rectangulo figura = new Rectangulo();

	// Imprime la base: "10" 
	System.out.println("Base: "+ figura.getBase());
	// Imprime la altura: "5"
	System.out.println("Altura: "+ figura.getAltura());
	// Imprime el area con los valores de la base y la altura dadas anteriormente 
	System.out.println("Área: "+ figura.getArea());
	// Imprime el perimetro con los valores de la base y la altura dadas anteriormente
	System.out.println("Perímetro: "+ figura.getPerimetro());

	// Se crea un objeto llamado 'figura2' de la clase Rectangulo, con el metodo que tiene parametros	
	Rectangulo figura2 = new Rectangulo(15,7);

	// Imprime la base dada por el usuario 
	System.out.println("Base: "+ figura2.getBase());
	// Imprime la altura dada por el usuario
	System.out.println("Altura: "+ figura2.getAltura());
	// Imprime el area con los valores de la base y la altura dadas por el usuario
	System.out.println("Área: "+ figura2.getArea());
	// Imprime el perimetro con los valores de la base y la altura dadas por el usuario
	System.out.println("Perímetro: "+ figura2.getPerimetro());

	// Imprime la altura, base, area y perimetro de 'figura', por parte del toString
	System.out.println(figura);
	// Imprime la altura, base, area y perimetro de 'figura2', por parte del toString
	System.out.println(figura2);
    } // Cierre del metodo main
} // Cierre de la clase MainRec
