import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {

	public static int impar(int i) {
		i= (int)(Math.random()*100+1);
		if(i%2!=0) {
			return i;
		}else {
			return impar(i);
		}
	}
	public static void main(String[] args) {
		/*
		 * Crea un array de números de un tamaño pasado por teclado, el array contendrá
		 * números aleatorios primos entre los números deseados, por último nos indica
		 * cual es el mayor de todos.
		 * 
		 * Haz un método para comprobar que el número aleatorio es primo, puedes hacer
		 * todos lo métodos que necesites.
		 */
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce el tamaño");
		int num= src.nextInt();
		int Banana []= new int [num];
		int i=0;
		int mayor=0;
		int Contenido = 0;
		do {
			
			
			Banana[i]=impar(Contenido);
			if(mayor<Banana[i]) {
				mayor=Banana[i];
			}
			i++;
			
		} while (i<num);
		for(int a=0; a<Banana.length; a++){
			System.out.println(Banana[a]);
		}
		System.out.println("El número más grande es "+mayor);
	}
}
