import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		Muestra por consola el indice y el valor al que corresponde. Haz dos métodos, 
		uno para rellenar valores y otro para mostrar.*/
		int [] Banana= new int [10];
		Scanner src = new Scanner(System.in);
		int num=0;
		System.out.println("Introduzca 10 números");
		
		for(int i=0; i<10; i++) {
			num=src.nextInt();
			
			Banana[i]=num;
		}
		for(int i=0; i<10; i++) {
			System.out.println(" En el indice"+i+ "uno está el número"+Banana[i]);
		}
	}
}
