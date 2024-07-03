package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Propuesto2 {
	private int num=0;
	public  static  int Elevador2(int num) {
		
		return num*2;
		
	}
	public static   int Elevador3(int num) {
		
		return  num*3;
	}
	public  static int Elevador4(int num) {
	return num*4;
	}

	@Override
	public String toString() {
		return "Propuesto2 [num=" + num + "]";
	}
	Propuesto2(int num){
		this.num=num;
	}
	public int Elv2() {
		return this.num*2;
	}
	public int Elv3() {
		return this.num*3;
	}
	public int Elv4() {
		return this.num*4;
	}
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		/*
		 * Realiza una clase minumero que proporcione el doble, triple y cuádruple de un
		 * número proporcionado en su constructor (realiza un método para doble, otro
		 * para triple y otro para cuádruple). Haz que la clase tenga un métock main y
		 * comprueba los distintos métodos.
		 */
		System.out.println("introduce un número ");
		int num = src.nextInt();
		System.out.println("El doble del numero "+num+" es "+Elevador2(num));
		System.out.println("El triple del numero "+num+" es "+Elevador3(num));
		System.out.println("El cuadrople del numero "+num+" es "+Elevador4(num));
	}
}
