package Ejercicios;

import java.util.Arrays;

public class Ejercicio614 {

	public static int [] obtenerLongCadenas(String[] frases) {
		
		if(frases==null) {
		System.out.println("Invalido");
			return null;
		}
		int [] ARR= new int [frases.length];
	
		for(int i=0; i<frases.length; i++) {
		String aux="";
	
		aux = frases[i];
		
		ARR[i]=aux.length();	
		}
		
		return ARR;
		
	}
	public static void main(String[] args) {
		
		String [] frases = {"a","ab","abc","abcd","abcde"};
		int []Arr= obtenerLongCadenas(frases);
		System.out.println(Arrays.toString(frases));
		System.out.println(Arrays.toString(Arr));
	}
}
