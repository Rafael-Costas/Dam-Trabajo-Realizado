package Ejercicios;

public class MetodoEjemplo {
	
	
	/*
	 * Este es el metodo bubble short
	 */

	public static void obtenerArray(String[] arrCad) {
		if(arrCad ==null) {
			throw new IllegalArgumentException("Paramatro no válido");
		}
		int numVeces00;
		for(int i=0; i<arrCad.length; i++) {
			if(arrCad[i] !=null) {
				for(int j= i+1; j< arrCad.length; j++) {
					if(arrCad[j].toUpperCase().compareTo(arrCad[i].toUpperCase())<0) {
						String cadAux = arrCad[i];
						arrCad[i] = arrCad[j];
						arrCad[j]=cadAux;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
