package ArcoFinal;

import java.util.Scanner;

public class Ejempplo2 {

	public static void main(String[] args) {
		int matemáticas = 4, lengua = 2;
		Scanner src= new Scanner(System.in);
		System.out.println("Que has sacado en Mates");
		matemáticas=src.nextInt();
		System.out.println("Que has sacado en Lengua");
		lengua=src.nextInt();
		if (matemáticas >= 5) {
			if (lengua >= 5) {
				System.out.println("has aprobado mates y lengua ");
			} else {
				System.out.println("No has aprobado Lengua pero si mates");
			}
		} else  {
			if(lengua >= 5) {
				System.out.println("Has aprobado solo lengua");
			}else {
				System.out.println("Estudia");
			}
	}
}
}