package ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class coleccionDisco {
	/*
	 * Ejercicio 5 Realiza de nuevo el ejercicio de la colección de discos pero
	 * utilizando esta vez una lista para almacenar la información sobre los discos
	 * en lugar de un array convencional. Comprobarás que el código se simplifica
	 * notablemente ¿Cuánto ocupa el programa original hecho con un array? ¿Cuánto
	 * ocupa este nuevo programa hecho con una lista?
	 */
public static int ComprobarCodigo(disco[] discos) {
	
	Scanner src= new Scanner(System.in);
	System.out.println("por favor, introduzca del disco que desea borrar/modificar ");
	String code =src.next();
	int i=-1;
	do {
		i++;
	}while(i!=discos.length && !((discos[i].getCodigo()).equals(code))) ;
	
	return i;
}
public static String ComprobarCodigoString(disco[] discos) {
	
	Scanner src= new Scanner(System.in);
	System.out.println("por favor, introduzca del disco que desea borrar/modificar ");
	String code =src.next();
	int i=-1;
	do {
		i++;
	}while(i!=discos.length && !((discos[i].getCodigo()).equals(code))) ;
	String a="";
	if(i!=discos.length) {
		a+=i;
	}else {
		a=i+"";
	}
	
	return a;
}

	
	public static void main(String[] args) {

		// N determina el tamaño del array
		final int N = 100;

		// Crea el array de discos
		disco[] discos = new disco[N];

		// Crea todos los discos que van en cada una de las celdas del array
		// estan vacios solo tienen el codigo como libre
		for (int i = 0; i < N; i++) {
			discos[i] = new disco();
		}
		discos[0] = new disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
		discos[1] = new disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
		discos[2] = new disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

		
		// opcion de menu
		int opcion;
		Scanner s = new Scanner(System.in);
		String codigoIntroducido;
		String autorIntroducido;
		String tituloIntroducido;
		String generoIntroducido;
		int duracionIntroducida;

		
		do {
			System.out.println("\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");
				for (disco d : discos) {
					if (!d.getCodigo().equals("LIBRE")) {
						System.out.println(d);
					}
				}
				break;

			case 2:
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");

				// Busca la primera posición libre del array
				int primeraLibre = -1;
				do {
					primeraLibre++;
					System.out.println("Indice del array: " +primeraLibre);
				} while (!((discos[primeraLibre].getCodigo()).equals("LIBRE")));

				System.out.println("Por favor, introduzca los datos del disco.");
				System.out.print("Código: ");
				codigoIntroducido = s.nextLine();
				System.out.print("Autor: ");
				autorIntroducido = s.nextLine();
				System.out.print("Título: ");
				tituloIntroducido = s.nextLine();
				System.out.print("Género: ");
				generoIntroducido = s.nextLine();
				System.out.print("Duración: ");
				duracionIntroducida = Integer.parseInt(s.nextLine());
				discos[primeraLibre] = new disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido,
						duracionIntroducida);

				break;

			case 3:
				 System.out.println("\nMODIFICAR");
			        System.out.println("===========");
			        
			     /*   System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
			        codigoIntroducido = s.nextLine();
			  */
			      /*  int i = -1;
			        do {
			          i++;
			        } while (i!=discos.length && !((discos[i].getCodigo()).equals(codigoIntroducido))  );
			        
			        if(i==discos.length) {
			        	System.out.println("No encontrado ");
			        }else {
			        */
			      //  int i =ComprobarCodigo(discos);
			     //   i =Integer.parseInt(ComprobarCodigoString(discos));
			       String a =ComprobarCodigoString(discos);
			       int i =Integer.parseInt(a);
			        if( i!=discos.length) {
			        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
			  
			        System.out.println("Código: " + discos[i].getCodigo());
			        System.out.print("Nuevo código: ");
			        codigoIntroducido = s.nextLine();
			        if (!codigoIntroducido.equals("")) {
			          discos[i].setCodigo(codigoIntroducido);
			        }
			        
			        System.out.println("Autor: " + discos[i].getAutor());
			        System.out.print("Nuevo autor: ");
			        autorIntroducido = s.nextLine();
			        if (!autorIntroducido.equals("")) {
			          discos[i].setAutor(autorIntroducido);
			        }
			        
			        System.out.println("Título: " + discos[i].getTitulo());
			        System.out.print("Nuevo título: ");
			        tituloIntroducido = s.nextLine();
			        if (!tituloIntroducido.equals("")) {
			          discos[i].setTitulo(tituloIntroducido);
			        }
			        
			        System.out.println("Género: " + discos[i].getGenero());
			        System.out.print("Nuevo género: ");
			        generoIntroducido = s.nextLine();
			        if (!generoIntroducido.equals("")) {
			          discos[i].setGenero(generoIntroducido);
			        }
			        
			        System.out.println("Duración: " + discos[i].getDuracion());
			        System.out.print("Duración: ");
			        final String duracionIntroducidaString = s.nextLine();
			        if (!duracionIntroducidaString.equals("")) {
			          discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
			        
			        }
			        }else {
			        	System.out.println("Te has equivocado de codigo");
			        }
			        break;
				
			case 4:
				System.out.println("\nELIMINAR");
		        System.out.println("===========");
		        
		        System.out.print("Por favor, introduzca el código del disco cuyos datos desea Eliminar: ");
		        codigoIntroducido = s.nextLine();
		  
		         i = -1;
		        do {
		          i++;
		        } while (i!=discos.length && !((discos[i].getCodigo()).equals(codigoIntroducido)) );
		        if(i==discos.length) {
		        	System.out.println("No encontrado ");
		        }else {
		        discos[i].setCodigo("LIBRE");
		        System.out.println("Album borrado");
		        }
		        default:

			} // switch
		} while (opcion != 5);
	}

}