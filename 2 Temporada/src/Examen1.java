import java.util.Scanner;

public class Examen1 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1A Programa que indique si un año introducido por el usuario es
		 * bisiesto o no. Un año es bisiesto si es divisible entre 4, a menos que sea
		 * divisible entre 100.
		 * 
		 * Sin embargo, si un año es divisible entre 100 y además es divisible entre
		 * 400, también resulta bisiesto.
		 * 
		 * Ejemplo: 2000 y 2400 sí son bisiestos. 2100, 2200 y 2300 no lo son.
		 */
		Scanner src =new Scanner (System.in);
		System.out.println("Introduzca el año ");
		int año = src.nextInt();
		boolean visiesto=true;
		if(año%4==0 && año%100!=0) {
			System.out.println("Es visiesto");
			visiesto=false;
		}
		if(año%100==0 && año%400==0) {
			System.out.println("ES visiento");
			visiesto=false;
		}
		if(visiesto) {
			System.out.println("No es visiesto");
		}
		
	}
}
