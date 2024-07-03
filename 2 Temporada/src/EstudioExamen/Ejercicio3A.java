package EstudioExamen;

import java.util.Scanner;

public class Ejercicio3A {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Escribe los numeros separados por comas");
		String frase= src.next();
		System.out.println(frase);
		
		String [] num = frase.split(",");
		int [] sum = new int [num.length];
		
		//System.out.println(sum.length);
		//System.out.println(num.length);
		for(int i=0; i<sum.length; i++) {
			System.out.println(num[i]);
			sum[i]=Integer.parseInt(num[i]);
		}
for(int i=0; i<sum.length; i++) {
			
			System.out.print(sum[i] +" ");
		}
		
		
		int res=0;
		for(int i=0; i<sum.length; i++) {
			res +=sum[i];
			
		}
	System.out.println(res);
		
		
	}
}
