package Clase;

import java.util.Arrays;

public class resuelto2 {

	private static int[] listo;
	final static int POS=50;
	final static int Limites=100;
	public static int getAleatorio() {
	int num=(int)(Math.random()*Limites+1);
	return num;
	}
	
	public static void muestra() {
		for(int i=0; i<listo.length; i++) {
			System.out.println(listo[i]);
		}
	
	}
	public static void listar() {
		Arrays.toString(listo);
	}
	public static void GeneraArray() {
		listo =new int [POS];
		for(int i =0 ; i<listo.length;i++) {
			listo[i]=getAleatorio();
		}
	}
	public static void ordena() {
		Arrays.sort(listo);
	}
	public static void main(String[] args) {
		GeneraArray();
		System.out.println("Array desordenado");
		muestra();
		ordena();
		System.out.println("Array ordenado");
		muestra();
	}
}
