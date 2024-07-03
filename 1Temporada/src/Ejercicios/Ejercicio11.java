package Ejercicios;

public class Ejercicio11 {

	public static void main(String[] args) {
		System.out.println("pares");
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
			System.out.print(i+", ");
			}
			}
		System.out.println();
		System.out.println("Impares");
		for(int i=0; i<=50; i++) {
			if(i%2!=0) {
			System.out.print(i+", ");
			}
			}
	}
}
