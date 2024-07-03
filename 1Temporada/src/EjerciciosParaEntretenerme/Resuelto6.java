package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Resuelto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=200; i<=300; i++) {
			System.out.println(i+", ");
		}*/	
		Scanner src= new Scanner(System.in);
		int cont=0;
		System.out.println("Desde que numero quieres empezar ");
		int num1=src.nextInt();
		System.out.println("En que numero quieres terminar");
		int num2=src.nextInt();
		int suma=0;
		for(int i=num1; i<=num2; i++) {
			
			suma+=i;
			cont++;
		}
		System.out.println("la suma es "+suma);
	System.out.println("El total es "+cont);
	System.out.println("El promedio es "+(double)suma/cont);
	
	}

}
