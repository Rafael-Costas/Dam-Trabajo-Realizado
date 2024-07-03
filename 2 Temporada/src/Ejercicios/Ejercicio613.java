package Ejercicios;

import java.util.Arrays;

public class Ejercicio613 {
	
	
	public static int [] obtenerLongCadenas(String[] frases) {
		if(frases==null) {
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
		String[] Frases = {"a", "ab","abc","abcd","abcde"};
		
		int []Coso= {Frases.length};
	
		Coso = obtenerLongCadenas(Frases);
		System.out.println(Arrays.toString(Coso));
	}
}
