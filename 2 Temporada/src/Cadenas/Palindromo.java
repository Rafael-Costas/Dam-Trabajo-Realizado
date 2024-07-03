package Cadenas;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Escribe una palabra");
		String Palabra1=src.next();

		String Palabra2="";
		Palabra1=Palabra1.toLowerCase();
	for(int i=Palabra1.length()-1; i>=0; i--) {
		Palabra2+=Palabra1.charAt(i);
	
	}
	if(Palabra1.equals(Palabra2))
		System.out.println("Es palindromo");
	else
		System.out.println("No es palindromo");
		
	}
}
