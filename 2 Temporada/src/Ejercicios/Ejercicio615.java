package Ejercicios;

public interface Ejercicio615 {

	public static String obtenerCadenaMasLarga(String [] frases) {
		
		String palabra="";
		for (String string : frases) {
			if(string.length()>palabra.length()) {
				palabra =string;
			}
		}
		
		return palabra;
	}
	public static void main(String[] args) {
		
		
		String [] frases = {"a", "ab", "PalabraLarga","gad","nada","es pacio","Prueba para palabra larga"};
	
	String larga = obtenerCadenaMasLarga(frases);
	System.out.println(larga);
	}
}
