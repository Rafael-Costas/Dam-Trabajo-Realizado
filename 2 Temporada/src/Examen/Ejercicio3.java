package Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Código que vaya leyendo palabras desde el teclado hasta encontrar la
palabra "fin".
Cuando esto sucede, debe mostrar por pantalla la palabra que estaría
en la última posición alfabética de entre todas las escritas. La
palabra "fin" queda excluida.
	 */
	public static void main(String[] args) {
		Scanner src  =new Scanner(System.in);
		System.out.println("introduce palabras, Si quieres terminar escribe fin");
		String palabra="";
		String frase="";
		boolean fin=true;
		do {
			palabra=src.next();
			if(palabra.equals("fin")) {
				System.out.println("Se termino");
				fin=false;
			}else {
				frase+=palabra+" ";
			}
		}while(fin);
	
		String [] Arr = frase.split(" ");
		
		Arrays.sort(Arr);
	
		System.out.println("La ultima palabra alfabeticamente es " +Arr[Arr.length-1]);
		
		
		
	}
}
