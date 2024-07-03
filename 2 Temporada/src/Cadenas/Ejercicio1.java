package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		/*
		 * Dale vuelta a una frase, se a realizado con un for y con el uso de stringbuilder
		 */
		String Frase ="Hola Mundo";
		char [] Algo =  new char [Frase.length()];
		
		Scanner src= new Scanner(System.in);
		//Version Correcta 
		System.out.println("introduce una frase ");
		StringBuilder sb = new StringBuilder(src.nextLine());
		String reverso2=sb.reverse().toString();
		System.out.println(reverso2);
	
		
		//version complicada
		for(int i=0, j=Algo.length-1; i<Algo.length; i++, j--) {
			Algo[i]=Frase.charAt(j);
		}
		String reverso="";
		for(int i=0; i<Algo.length;i++) {
			reverso+=Algo[i];
		}
		
		System.out.println(reverso);
		
	}
}
