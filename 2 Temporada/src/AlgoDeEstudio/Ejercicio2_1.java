package AlgoDeEstudio;

import java.util.Scanner;

public class Ejercicio2_1 {
	public static void main(String[] args) {
		
	
	Scanner src= new Scanner(System.in);
	
	System.out.println("Introduce una frase");
	String frase= src.next();
	System.out.println("Pon un numero");
	char letra= src.next().charAt(0);
	for(int i=0; i<frase.length(); i++) {
		if(frase.charAt(i)== letra) {
			System.out.println("Está el numero");
		}
	}
	
	
}
}
