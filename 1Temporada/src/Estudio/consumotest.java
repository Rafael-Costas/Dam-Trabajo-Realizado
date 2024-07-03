package Estudio;

import java.util.Scanner;

public class consumotest {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		consumo algo= new consumo();
		algo.getVariables(2, 2, 2, 2);
		System.out.println(algo.consumoEuros());
		System.out.println(algo.consumpMedio());
		System.out.println(algo.tiempo());
	
	}
}
