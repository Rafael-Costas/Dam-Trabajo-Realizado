package Ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio618 {

	public static String [] Ordenar(String [] frases) {
		String [] res = new String [frases.length];
		
		for(int i=0; i<res.length; i++) {
			frases[i]=frases[i].toLowerCase();
		}
		
		Arrays.sort(frases);
		
		
		
		return frases;
		
	}
	
	public static void main(String[] args) {
	
		String [] Frases= {"Angosto","Casa", "Barcelona", "Andulacia", "Banana"};
		System.out.println(Arrays.toString(Frases));
		Frases=Ordenar(Frases);
		System.out.println(Arrays.toString(Frases));
		String Frase= Frases[0];
		
	
		
		
	}
}
