package ArrayList2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(18);
		numeros.add(22);
		numeros.add(-30);
		System.out.println("Nº de elementos: "+ numeros.size());
		System.out.println("Ele elemento que hay en la posicion 1 es "+ numeros.get(0));
		System.out.println(numeros);
		System.out.println("Cuidado con los set");
		numeros.set(1, 555);
		System.out.println(numeros);
		Scanner src= new Scanner(System.in);
		int cont=0;
		for (Integer n : numeros) {
			System.out.println("Posicion: "+cont+" Resultado: "+n);
			System.out.println("introduce un numero");
			Integer num = src.nextInt();
			numeros.set(cont, num);
			System.out.println("Posicion: "+cont+" Resultado: "+n);
			cont++;
		}
		System.out.println(numeros);
	numeros.iterator();
	}
}
