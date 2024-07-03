package Objetos;

import java.util.Scanner;

public class PesoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String m;
		double v;
		int cont=1;

		while (cont==1) {
			System.out.println("valor???: ");
			v = sc.nextDouble();
			System.out.println("que unidad es???: ");
			m = sc.next();

			Peso dos = new Peso(v, m);

			
			System.out.println(dos.toString() + " en kilos");
			System.out.println(dos.valor);
			System.out.println("Quieres Continuar?");
			System.out.println("1 para continuar, otro numero para parar");
			cont= sc.nextInt();
			
		}
	}
}
