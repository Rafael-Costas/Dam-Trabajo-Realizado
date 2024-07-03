package ArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {

	
	public static void main(String[] args) {
		ArrayList<Integer> List= new ArrayList<>();
		Scanner src= new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.println("Introduce un numero");
			List.add(src.nextInt());
		}
		System.out.println(List);
		Collections.sort(List);
		
		System.out.println(List);
	}
	
}
