package Examen_24_03;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4B {

	public static void main(String[] args) {
		/*
		 * Ejercicio 4B 1.5p Ingrese un texto de al menos 6 palabras e indique qué
		 * letras no han aparecido en el texto.
		 */
	
		
		
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce una frase de al menos 8 palabras");
		String frase = src.nextLine();
		
		
		if(frase.split(" ").length<6) {
			do {
				System.out.println("tienen que ser como minimo 6 palabras");
				frase += " "+src.nextLine();
			}while(frase.split(" ").length<6);
		
	}
		int cont=97;
		char [] letras = new char[26];
			for(int i=0; i<26; i++) {
			letras[i] = (char)cont;
			cont++;
		}
		int [] apariciones=new int [26];
		 cont=0;
		 frase.trim();
		 String [] palabras=frase.split(" ");
		for(int i=0; i<letras.length; i++) {
			for(int j=0; j<frase.length(); j++) {
				if(letras[i]==frase.charAt(j)) {
					cont++;
				}
				
			}
			apariciones[i]=cont;
			cont =0;
		}
		
	
		
		for(int i=0; i<apariciones.length; i++) {
			
			if(apariciones[i]==0) {
				System.out.println("la letra "+letras[i]+" no aparecio");
			}
		}

	}
}