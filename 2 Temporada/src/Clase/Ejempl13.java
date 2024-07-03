package Clase;

import java.util.Scanner;

public class Ejempl13 {

	private static String [] lista;
	final static int POS = 10;
	public static void muestra(){
		for(int i=0; i<POS; i++) {
			System.out.print(lista[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		lista = new String[POS];
		Scanner src = new Scanner(System.in);
		for(int j=0; j<POS; j++) {
			lista[j]=src.next();
		}
		
		muestra();
		
		
	}
}
