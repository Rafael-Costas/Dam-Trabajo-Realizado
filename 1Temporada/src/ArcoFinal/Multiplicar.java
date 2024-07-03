package ArcoFinal;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		System.out.println("Introduce un numero");
		Scanner src= new Scanner(System.in);
		
		
		for(int i=0; i<=10;i++) {
			System.out.println();
			System.out.println("Tabla del "+i);
			for(int k=1; k<=10; k++) {
			System.out.println(i+" por "+k+" es "+i*k);
			}
			}
	}
}
