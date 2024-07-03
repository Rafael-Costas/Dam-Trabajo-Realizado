package Boletin2023;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*
		 * 16. Queremos desarrollar una aplicación que nos ayude a gestionar las notas
		 * de un centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se
		 * pide leer las notas del primer, segundo y tercer trimestre de un grupo.
		 * Debemos mostrar al final: la nota media del grupo en cada trimestre, y la
		 * media del alumno que se encuentra en la posición N (N se lee por teclado).
		 */
		int []Alumno1= {1,2,4};
		int []Alumno2= {5,7,3};
		int []Alumno3= {5,10,6};
		int []Alumno4= {3,7,1};
		int []Alumno5= {1,10,10};
		
		int[][] Grupo = { Alumno1, Alumno2, Alumno3, Alumno4, Alumno5 };
	 Scanner src= new Scanner(System.in);
		System.out.println("Que grupo quieres leer, como maximo 5");
		int grupo =src.nextInt();
		
		int media1 =0;
		for(int i=0; i<Grupo.length; i++) {
			media1 += Grupo[i][0];
			
		}
		int media2 =0;
		for(int i=0; i<Grupo.length; i++) {
			media2 += Grupo[i][1];
			
		}
		int media3 =0;
		for(int i=0; i<Grupo.length; i++) {
			media3 += Grupo[i][0];
			
		}
		
		System.out.println("Media del trimestre 1 "+media1/3);
		System.out.println("Media del trimestre 2 "+media2/3);
		System.out.println("Media del trimestre 3 "+media3/3);
		
		System.out.println("De que alumno quieres saber la media??");
		int abc =src.nextInt();
		
		int medP=0;
		for(int i=0; i<Grupo[abc].length; i++) {
			medP+=Grupo[abc][i];
		}
		
		System.out.println("El alumno tiene una media de "+medP/3);
		
		
	 
	 
	 
	}
}
