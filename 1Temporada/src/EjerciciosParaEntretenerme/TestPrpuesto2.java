package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class TestPrpuesto2 {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		
		System.out.println("Introduce un número weon");
		int num= src.nextInt();
		
		System.out.println("El doble del numero "+num+" es "+Propuesto2.Elevador2(num));
		System.out.println("El triple del numero "+num+" es "+Propuesto2.Elevador3(num));
		System.out.println("El cuadrople del numero "+num+" es "+Propuesto2.Elevador4(num));
		
		Propuesto2 a= new Propuesto2(2);
		
		System.out.println(a.Elv2());
		System.out.println(a.Elv3());
		System.out.println(a.Elv4());
		System.out.println(a.toString());
		
	}
}
