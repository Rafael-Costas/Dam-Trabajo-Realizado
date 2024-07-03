package Estudio;

import java.util.Arrays;

public class EjemploParamatros {

	public static void cambiar(int x) {
		x++;
	}

	public static void cambiar2(int[] par) {
		par[0]++;
	}

	public static void main(String[] args) {

		int x = 3;
		int[] matriz = { 1, 2, 3 };
		
		
		cambiar(x);
		for (int i = 0; i <= matriz.length - 1; i++) {

			System.out.println(matriz[i]);
		}
		
		// System.out.println(x);
		cambiar2(matriz);
		System.out.println(Arrays.toString(matriz));

	}
}
