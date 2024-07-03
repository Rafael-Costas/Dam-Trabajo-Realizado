package Boletin;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		/*
		 * 18. Igual que el anterior pero suponiendo que no se introduce el precio por
		 * litro. Solo existen tres productos con precios: 1- 0,6 €/litro, 2- 3 €/litro
		 * y 3- 1,25 €/litro.
		 */
		Scanner src = new Scanner(System.in);
		int codigo = 0;
		int caro = 0;
		int codigo_primero = 0;
		int litros_primero = 0;
		int litros_Vendidos = 0;
		int opc = 0;

		int total = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("introduce el codigo");
			codigo = src.nextInt();
			System.out.println("Cuanta cantidad vendiste");
			litros_Vendidos = src.nextInt();
			System.out.println("Pulse 1 para pagar 0,6/litro, pulse 2 para pagar 3/litro, pulsa 3 para pagr 1,25/litro ");
			opc=src.nextInt();
			switch (opc) {
			case 1:
				total += litros_Vendidos * 0.6;
				if (litros_Vendidos * 0.6 > 600) {
					caro++;
				}
				break;
			case 2:
				total += litros_Vendidos * 3;
				if (litros_Vendidos * 3> 600) {
					caro++;
				}
				break;
			case 3:
				total += litros_Vendidos * 1.25;
				if (litros_Vendidos * 1.25 > 600) {
					caro++;
				}
				break;
			}

			if (i == 0) {
				codigo_primero = codigo;
				litros_primero = litros_Vendidos;
			}
		}
		System.out.println("La factura total es de " + total);
		System.out.println("Del elemento " + codigo_primero + " vendiste " + litros_primero + " litros");
		System.out.println("Hay " + caro + " facturas que superan los 600$");
	}
}