package usoDeFicheros;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Enunciado Ficheros Binarios Crea un programa que pida por teclado la ruta de
		 * un fichero y la cantidad de números aleatorios que queremos generar. Los
		 * números generados se guardarán en el fichero usando DataOutputStream, en otro
		 * método los leeremos del fichero utilizando DataInputStream y los mostraremos
		 * en pantalla. El rango de los números aleatorios estará entre 0 y 100,
		 * incluyendo el 100. Cada vez que ejecutemos la aplicación añadiremos números
		 * al fichero sin borrar los anteriores, es decir, si creo el fichero añadiendo
		 * 10 números y después añadimos otros 10, al final el fichero habrá 20 números
		 * que se mostrarán por pantalla.
		 */
		
		System.out.println("Cuantos numeros aleatorios?");
		Scanner src= new Scanner(System.in);
		int num =src.nextInt();
		
		Random r1 = new Random();
		num = r1.nextInt(num);
		
		System.out.println(num);
	}
}
