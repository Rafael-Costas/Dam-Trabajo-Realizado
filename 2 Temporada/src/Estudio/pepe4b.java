package Estudio;

import java.util.Arrays;
import java.util.Scanner;

public class pepe4b {

	public static void main(String[] args) {

		int contador = 0;
		Scanner sc = new Scanner(System.in);
		char[] letras = new char[26];
		int[] veces = new int[26];
		for (int j = 0; j < letras.length; j++) {
			letras[j] = (char) ('a' + j);
		}
		boolean seguir = true;

		String analisis;
		do {
			System.out.println("introduce palabras (minimo ocho): ");
			analisis = sc.nextLine();
			String[] trozos = analisis.split("");
			contador = trozos.length;
			if (contador >= 8) {
				seguir = false;
			} else {
				System.out.println("incorrecto");
				System.out.println("introduce palabras (minimo ocho)");
				analisis = sc.nextLine();
			}
		} while (seguir);

		System.out.println(analisis);

		for (int i = 0; i < letras.length; i++) {
//contar cuantas veces apareces cada letra
			for (int j = 0; j < analisis.length(); j++)
				if (analisis.charAt(j) == letras[i])
					veces[i]++;

		}
		int primero=0, segundo=0, tercero=0;
		int [] aux = new int [veces.length];
		for (int i=0; i<aux.length; i++) {
			aux[i]=veces[i];
		}
		System.out.println(Arrays.toString(letras));
		System.out.println(Arrays.toString(veces));
	
		Arrays.sort(veces);
		
		
			primero=veces[(veces.length-1)];
			segundo=veces[(veces.length-1)-1];
			tercero=veces[(veces.length-1)-2];
			int posp=0, poss=0, post=0;
			int cont=0;
		boolean palante =true;
			
			do {
				if(primero==aux[cont]) {
					posp=cont;
					palante =false;
				}else {
				cont++;
				}
				
			}while(palante);
			palante=true;
			cont=0;
			do {
				if(segundo==aux[cont] && posp!=cont) {
					poss=cont;
					palante =false;
				}
				else {
				cont++;}
				
			}while(palante);
			palante=true;
			cont=0;

			do {
				if(tercero==aux[cont]&& poss!=cont && posp!=cont) {
					post=cont;
					palante =false;
				}
				else {
				cont++;}
			}while(palante);
			
			System.out.println(posp);
			System.out.println(poss);
			System.out.println(post);
	
		System.out.println("La tercera letra que más a aparecido es "+ letras[post]+" con una cantidad de veces igual a "+tercero);
		System.out.println("La segunda letra que más a aparecido es "+ letras[poss]+" con una cantidad de veces igual a "+segundo);
		System.out.println("La primera letra que más a aparecido es "+ letras[posp]+" con una cantidad de veces igual a "+primero);

		
	}
}
