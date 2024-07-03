package Ejercicio1;

import java.util.Scanner;



public class test {
public static void main(String[] args) {
	Cine Cine1 = new Cine((byte) 4, "cerca 1");
	Cine Cine2 = new Cine((byte) 3, "media 2");
	Cine Cine3 = new Cine((byte) 2, " lejos 3");

	String Accion;
Scanner src= new Scanner(System.in);
	do {
		System.out.println("m meter, s sacar  salir");
		Accion = src.nextLine();
		if (Accion.equals("m")) // meter contenedor
			if (Cine1.HayHueco())
				Cine1.MeteContenedor();
			else if (Cine2.HayHueco())
				Cine2.MeteContenedor();
			else if (Cine3.HayHueco())
				Cine3.MeteContenedor();
			else
				System.out.println("Hay que esperar a que vengan a quitar un contenedor");
		else // sacar contenedor
		if ( Cine1.HayContenedor() )
			Cine1.SacaContenedor();
		else if (Cine2.HayContenedor())
			Cine2.SacaContenedor();
		else if (Cine3.HayContenedor())
			Cine3.SacaContenedor();
		else
			System.out.println("Hay que esperar a que vengan a poner un contenedor");
	} while (!Accion.equals("salir"));
}
}

