package IntentoExamne;

public class Ejercicio1 {

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
	public static void bisiesto(int bisiesto) {
		if(bisiesto%4==0 && bisiesto%100!=0) {
			System.out.println("Es bisiesto");
		}else if(bisiesto%100==0 && bisiesto%400==0) {
			System.out.println("Es bisiesto");
		}else {
			System.out.println("Vete a la mierda");
		}
		
	}
	public static void main(String[] args) {

		bisiesto(2680);
	}
}
