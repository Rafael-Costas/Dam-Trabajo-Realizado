package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class LecturadePalabras {

	public static final int Num_Palabras=10;
	public static void main(String[] args) {
		
		Scanner src= new Scanner(System.in);
	
		

		
		System.out.println("Escribe "+Num_Palabras+" palabras separadas por espacios.");
		System.out.println("Las puedes escribir en lineas de texto diferente, si quieres");
		String [] Palabras = new String [4];
		System.out.println(Arrays.toString(Palabras));
		for(int i=0; i<Palabras.length; i++) {
			 Palabras[i]=src.nextLine();
			 
		}
		for(int i=0; i<Palabras.length; i++) {
			System.out.println("Frase "+i+" es "+Palabras[i]);
		}
		System.out.println(Arrays.toString(Palabras));
		
	}
}
