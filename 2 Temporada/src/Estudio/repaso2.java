package Estudio;

import java.util.Arrays;
import java.util.Scanner;

public class repaso2 {

	public static void pideNumeros(int [] a) {
		Scanner src= new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println("Introduce numeros ");
		a[i] =src.nextInt();
		}
		
	}
	public static void avanza(int [] a,int  num) {
		for( int z=0; z<num; z++) {
			int aux=a[a.length-1];
		for(int i=a.length-1; i>0; i--) {
			
		a[i]=a[i-1];
		}
		a[0]=aux;
		}
	}
	public static void main(String[] args) {
		
		Scanner src =new Scanner(System.in);
		
		int [] Arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		//pideNumeros(Arr);
		System.out.println("Cuantos desplazamientos quieres realizar ");
		int num = src.nextInt();
		avanza(Arr, num);
		System.out.println(Arrays.toString(Arr));
		
		
	}
}
