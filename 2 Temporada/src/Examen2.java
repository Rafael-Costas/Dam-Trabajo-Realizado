import java.util.Iterator;

public class Examen2 {

	public static void primos(int num) {
		for(int i=2; i<num/2; i++) {
			if(num%i==0) {
				System.out.println(num+"Ni de puta coña");
			}else {
				System.out.println(num+"Pues si");
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
		for(int i=1; i<=100; i++) {
			primos(i);
		}
		
	}
}
