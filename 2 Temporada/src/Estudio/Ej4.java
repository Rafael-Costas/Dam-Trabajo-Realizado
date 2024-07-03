package Estudio;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		/*
		 * Final ejercicio de contar letras (mostrar las tres que aparecen mas)
		 */
	char [] letras = new char [26];
	int [] num = new int [26];
	for(int i=0; i<letras.length; i++) {
		letras[i]= (char) ('a'+i);
	}
	Scanner src= new Scanner(System.in);
	System.out.println("Introduce una frase de al menos 8 palabras");
	String frase = src.nextLine();
	
	
	if(frase.split(" ").length>8) {
		do {
			System.out.println("tienen que ser como minimo 8 palabras");
			frase += " "+src.nextLine();
		}while(frase.split(" ").length>8);
	
}
	
	for(int i=0; i<frase.length(); i++) {
	for(int z=0; z<letras.length; z++) {
		if(letras[z]==frase.charAt(i)) {
			num[z]+=1;
		}
	}
	}
	
int tercero=0;
int primero=0;
int segundo=0;
int t=0;
int p=0;
int s=0;

int aux=0;
	for(int i=0; i<letras.length; i++) {
		if(num[i]>tercero)
			
			
			tercero=i;
		if(tercero>segundo) {
			
			
			
			aux=segundo;
			segundo=tercero;
			tercero=aux;
		}
		if(segundo>primero) {
			
			
			
			aux=primero;
			primero=segundo;
			segundo=aux;
			aux=segundo;
			segundo=tercero;
			tercero=aux;
		}
					
	
	}
	
	
	for(int i=0; i<letras.length; i++) {
		if(tercero==i) {
			System.out.println("La tercera letra que mas aparece es "+letras[i]+" han aparecido " +num[i]);
		}
		if(segundo==i) {
			System.out.println("La seguna letras que mas aparece es "+letras[i]+" han aparecido " +num[i]);
		}
		if(primero==i) {
			System.out.println("La primera letras que mas aparece es "+letras[i]+" han aparecido " +num[i]);
		}
	}
	}
}
