package Ejercicios;

import java.util.Arrays;

public class Ejercicio616 {

	public static String[] obtenerArr5Vocales(String [] Frases) {
		
		
		String [] res;
		int contador=0;
		for (String string : Frases) {
			string=string.toLowerCase();
			if(string.indexOf("a")!=-1 && string.indexOf("e")!=-1 && string.indexOf("i")!=-1 &&
					string.indexOf("u")!=-1 && string.indexOf("o")!=-1 ) {
				
				contador++;
				
			}
			
		}
		
		res = new String[contador];
		contador =0;

		for(int i=0; i<Frases.length; i++) {
			
			Frases[i]=Frases[i].toLowerCase();
			
			if(Frases[i].indexOf("a")!=-1 && Frases[i].indexOf("e")!=-1 && Frases[i].indexOf("i")!=-1 &&
					Frases[i].indexOf("u")!=-1 && Frases[i].indexOf("o")!=-1) {
				res[contador]=Frases[i];
				contador++;
				
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		
		String [] frses= {"murcielago", "algo", "nada", "Euforia"};
		
		String [] res=obtenerArr5Vocales(frses);
		System.out.println(Arrays.toString(res));
	}
}
