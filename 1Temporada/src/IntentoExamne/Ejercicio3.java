package IntentoExamne;

public class Ejercicio3 {

	public static int Oouta(int i) {
		if(i<10) {
			return i;
		}
		return i%10+ Oouta(i/10);
		
	}
	
	public static void main(String[] args) {
		/*
		 * Ejercicio 3A Programar un algoritmo recursivo que permita sumar los dígitos
		 * de un número.
		 * 
		 * Ejemplo: Entrada: 123 Resultado: 6
		 */
		
		System.out.println(Oouta(730));
		
	}
}
