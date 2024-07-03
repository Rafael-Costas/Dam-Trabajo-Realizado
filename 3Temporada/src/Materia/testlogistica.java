package Materia;

import java.util.Scanner;

public class testlogistica {

	public static void main(String[] args) {
		Logistica2ç Almacen1 = new Logistica2ç((byte) 2, "cerca 1");
		Logistica2ç Almacen2 = new Logistica2ç((byte) 4, "media 2");
		Logistica2ç Almacen3 = new Logistica2ç((byte) 8, " lejos 3");

		String Accion;
Scanner src= new Scanner(System.in);
		do {
			System.out.println("m meter, s sacar  salir");
			Accion = src.nextLine();
			if (Accion.equals("m")) // meter contenedor
				if (Almacen1.HayHueco())
					Almacen1.MeteContenedor();
				else if (Almacen2.HayHueco())
					Almacen2.MeteContenedor();
				else if (Almacen3.HayHueco())
					Almacen3.MeteContenedor();
				else
					System.out.println("Hay que esperar a que vengan a quitar un contenedor");
			else // sacar contenedor
			if ( Almacen1.HayContenedor() )
				Almacen1.SacaContenedor();
			else if (Almacen2.HayContenedor())
				Almacen2.SacaContenedor();
			else if (Almacen3.HayContenedor())
				Almacen3.SacaContenedor();
			else
				System.out.println("Hay que esperar a que vengan a poner un contenedor");
		} while (!Accion.equals("salir"));
	}
} // clase
