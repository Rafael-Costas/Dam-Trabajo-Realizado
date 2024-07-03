package Ejemplos;

public class Ejemplo4 {

	public static void main(String[] args) {

		byte a = 2;
		System.out.println("Variable a (byte): " + a);
		short b = 1, c = 3;
		System.out.println("Variable a (Short): " + b);
		System.out.println("Variable a (Short): " + c);
		int d = -30;
		int e = 0xC125;
		System.out.println("d=" + d);
		System.out.println("Variable a (int): " + e);
		long h = 434123;

		long g = 5L; /* la L en este caso indica Long */
		System.out.println("h=" + h);
		System.out.println("g=" + g);
		char car1 = 'c';

		char car2 = 99; /* car1 y car2 son lo mismo porque el 99 en decimal es la ‘c’ */
		System.out.println("car1=" + car1);
		System.out.println("car2=" + car2);
		float pi = (float) 3.1416;
		float pi2 = 3.1416F;

		float medio = 1F / 2F; /* 0.5 */
		System.out.println("pi="+pi);
		System.out.println("pi2=" + pi2);
		System.out.println("medio=" + medio);
		double millon = 1e6; /* 1x106 */

		double medio2 = 1 / 2D; /* 0.5 la D en este caso indica Double */
		System.out.println("millon=" +millon);
		System.out.println("medio2=" +medio2);
		
		
		
		
	}
}
