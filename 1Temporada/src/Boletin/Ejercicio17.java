package Boletin;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		/*
		 * 17. Una empresa que se dedica a la venta de desinfectantes necesita un
		 * programa para gestionar las facturas. En cada factura figura: el código del
		 * artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5
		 * facturas introducidas: Facturación total, cantidad en litros vendidos del
		 * artículo 1 y cuantas facturas se emitieron de más de 600 €.
		 */
		Scanner src = new Scanner(System.in);
		int codigo = 0;
		int caro = 0;
		int codigo_primero=0;
		int litros_primero = 0;
		int litros_Vendidos = 0;
		int litro_precio = 0;
		int total = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("introduce el codigo");
			codigo = src.nextInt();
			System.out.println("Cuanta cantidad vendiste");
			litros_Vendidos = src.nextInt();
			System.out.println("Precio por litro");
			litro_precio = src.nextInt();
			total += litros_Vendidos * litro_precio;
			if (litros_Vendidos * litro_precio > 600) {
				caro++;
			}
			if (i == 0) {
				 codigo_primero = codigo;
				litros_primero = litros_Vendidos;
			}
		}
		System.out.println("La factura total es de "+total);
		System.out.println("Del elemento "+codigo_primero+" vendiste " +litros_primero+" litros");
		System.out.println("Hay "+caro+" facturas que superan los 600$");
	}
}
