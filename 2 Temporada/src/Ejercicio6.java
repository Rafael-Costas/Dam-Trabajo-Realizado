import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		// caracteres. Puedes hacer con o sin métodos de String.

	Scanner src= new Scanner(System.in);
	System.out.println("Introduce una frase");
	String frase= src.next();
	char [] hola = new char [frase.length()];
	
	for(int i=0; i<frase.length(); i++) {
		hola[i] = frase.charAt(i);
	}
	for(int i=0; i<frase.length(); i++) {
	System.out.print(hola[i]);
	}
	
	}
}
