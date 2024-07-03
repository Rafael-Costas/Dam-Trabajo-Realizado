package IntentoExamne;

public class Ejercicio2 {

	public static boolean primos(int i) {
		for(int a=2; a<i; a++) {
			if(i%a==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void gemelos() {
		for(int i=3; i<=100; i++) {
			if(primos(i)) {
				if(primos(i+2)) {
					System.out.println("El numero "+i+" y el numero "+(i+2)+" son primos gemelos ");
				}
			}
		}
	}
	public static void main(String[] args) {
		/*
		 * Ejercicio 2A Dos números primos son primos gemelos si su diferencia es igual
		 * a 2. Es decir, una pareja de la forma (p, p+2) siendo p un número primo es
		 * una pareja de números gemelos.
		 * 
		 * Por ejemplo, las parejas (3, 5) y (11,13) son dos parejas de primos gemelos.
		 * Listar por pantalla todos los números gemelos entre 0 y 100.
		
		 */
		gemelos();
	}
		
	}
	

