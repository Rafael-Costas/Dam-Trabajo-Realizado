package Estudio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3B {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3B Ingrese un texto e indique el porcentaje de palabras que tienen
		 * menos de 4 caracteres y el porcentaje de palabras con 4 o más caracteres.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("HOla");
		String texto = src.nextLine();
		String [] Arr = texto.split(" ");
		System.out.println(Arrays.toString(Arr));
		int contsup=0;
		int contInf=0;
		
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i].length()>4) {
				System.out.println("Hay "+contsup+" superiores a 4");
			}else {
				System.out.println("Hay "+contInf+" inferirors o igaul a 4");
			}
		}
	}
}
