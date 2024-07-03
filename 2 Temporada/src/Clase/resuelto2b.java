package Clase;

import java.util.Arrays;

public class resuelto2b {
	public static int getAleatorio() {
		int num=(int)(Math.random()*100+1);
		return num;
		}
	public static void listar(int[] arr) {
		Arrays.toString(arr);
	}
	public static int[] GeneraArray() {
		 int[] fuera = new int [30];
		for(int i =0 ; i<fuera.length;i++) {
			fuera[i]=getAleatorio();
		
		}
		return fuera;
	}
	public static void ordena(int[] arr) {
		Arrays.sort(arr);

	}
	public static void muestra(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int [] arr = GeneraArray();
		muestra(arr);
		
	}
}
