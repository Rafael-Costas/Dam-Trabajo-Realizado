package ArcoFinal;

import java.util.Scanner;

public class resuelto3 {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		int a=2;
		int cont =0;
		do {
		System.out.println(a);
		a+=2;
		cont++;
	}while(cont!=5);
		
		System.out.println("----------------------------------");
		a=0;
		for(int i=1; i<=50; i++) {
			a+=2;
			System.out.println(a);
		}
		System.out.println("----------------------------------");
		a=1;
		for(int i=1; i<=50; i++) {
			System.out.println(a);
			a+=2;
			
		}
		
				
	}
}
