package Estudio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3A {

	public static void main(String[] args) {
		Scanner src =new Scanner(System.in);
		System.out.println("Introduce numeros separados por letras");
		String frase=src.nextLine();
		String [] fras = frase.split(",");
		int [] num = new int[fras.length];
		for(int i=0; i<num.length; i++) {
			num[i]= Integer.parseInt(fras[i]);
		}
		System.out.println(Arrays.toString(num));
		int sol=0;
		for (int i : num) {
			sol+=i;
		}
		System.out.println("El total es "+sol);
	}
}
