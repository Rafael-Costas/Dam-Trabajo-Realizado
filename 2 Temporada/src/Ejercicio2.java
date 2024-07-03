import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Crea un array de números donde le indicamos por teclado el tamaño del array,
		 * rellenaremos el array con números aleatorios entre 0 y 9, al final muestra
		 * por pantalla el valor de cada posición y la suma de todos los valores. Haz un
		 * método para rellenar el array (que tenga como parámetros los números entre
		 * los que tenga que generar), para mostrar el contenido y la suma del array y
		 * un método privado para generar número aleatorio (lo puedes usar para otros
		 * ejercicios).
		 */
		Scanner src= new Scanner(System.in);
		
		System.out.println("De que tamaño quieres el array?");
		int num= src.nextInt();
		int res=0;
		int [] Banana= new int [num];
		
		for(int i= 0; i<num; i++) {
			int Contenido= (int)(Math.random()*10+1);
			Banana[i]= Contenido;
		}
		for(int i=0; i<num; i++) {
			res+=Banana[i];
		}
		for(int i= 0; i<num; i++) {
			System.out.println(Banana[i]);
			
		}
		System.out.println("El resultado de la suma es "+ res);
		
		
	}
}
