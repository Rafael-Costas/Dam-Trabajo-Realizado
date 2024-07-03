package Algo;

public class Ejercicio1 {
	class Test {
		public static char getLetras() {
			return (char) (Math.random() * 26 + 'a');
		}
		
		/*
		 * 1. Realiza un método para la clase Test que genere letras de forma aleatoria.
		 * Como ejercicio complementario inves- tiga el funcionamiento y uso de la
		 * función Math.random().
		 */

		public static void main(String[] args) {
			System.out.println(getLetras());
			System.out.println(getLetras());
			System.out.println(getLetras());
			System.out.println(getLetras());
		
		}
	}}
