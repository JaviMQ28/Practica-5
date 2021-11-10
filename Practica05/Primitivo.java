/**
 * Clase Primitivo que representa el tamaño en bytes de cada tipo primitivo
 * @author Javier Alejandro Mancera Quiroz 
 * @version 1.0
 * */
public class Primitivo{
    /**
     * Metodo principal main para poder ver el tamaño de cada tipo primitivo 
     * @param args Los argumentos
     * */
    public static void main(String[] args){
	// Imprime: "***Tipos primitivos***"
	System.out.println("***Tipos primitivos***");
	// Imprime el tamaño en bytes del tipo primitivo: byte 
	System.out.println("byte: "+ Byte.BYTES+ " byte");
	// Imprime el tamaño en bytes del tipo primitivo: short
	System.out.println("short: "+ Short.BYTES+ " bytes");
	// Imprime el tamaño en bytes del tipo primitivo: int
	System.out.println("int: "+ Integer.BYTES+ " bytes");
	// Imprime el tamaño en bytes del tipo primitivo: long
	System.out.println("long: "+ Long.BYTES+ " bytes");
	// Imprime el tamaño en bytes del tipo primitivo: float
	System.out.println("float: "+ Float.BYTES+ " bytes");
	// Imprime el tamaño en bytes del tipo primitivo: double
	System.out.println("double: "+ Double.BYTES+ " bytes");
	// Imprime: "boolean: 1 byte"
	System.out.println("boolean: 1 byte");
	// Imprime el tamaño en bytes del tipo primitivo: char
	System.out.println("char: "+ Character.BYTES+ " bytes");
    } // Cierre del método main
} // Cierre de la clase Primitivo
