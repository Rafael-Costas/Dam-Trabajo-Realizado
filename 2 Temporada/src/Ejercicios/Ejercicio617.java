package Ejercicios;

public class Ejercicio617 {

	public static int checkeoLetra(String [] frases, char letra) {
		int contador=0;
		for (String string : frases) {
			char [] arr=string.toCharArray();
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==letra) {
					contador++;
				}
			}
			
		}
		
		return contador;
	}
	public static void main(String[] args) {
		
		String [] frases= {"casa", "macedonia", "letargo"};
		System.out.println("Hay un total de "+checkeoLetra(frases, 'a'));
		
	}
}
