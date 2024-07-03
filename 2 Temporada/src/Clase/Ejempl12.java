package Clase;

public class Ejempl12 {

	public static void main(String[] args) {
		String cadena = "La casa de bernarda alba es libro que nadie se ha leido pero todos conocen ";
		
		//declarar un arrays de string
		
		String [] Arr = cadena.split(" ");
		
		for(int i=0; i<Arr.length; i++) {
			System.out.println("Palabra "+i+ " es "+Arr[i]);
		}
	}
}
