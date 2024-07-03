package ArcoFinal;

import java.util.Scanner;

public class resuelto2 {

	public static void main(String[] args) {
	Scanner src= new Scanner(System.in);
	
	System.out.println("cuantoas filas quieres");
	int filas=src.nextInt();
		int i, j, k;
		for (i = 1; i <= filas; i++) { // bucle que cuenta hasta 10
			for (k = 1; k <= filas - i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * (i - 1) + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
		
	    }
	
}
