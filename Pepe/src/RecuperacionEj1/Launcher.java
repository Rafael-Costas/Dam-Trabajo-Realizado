package RecuperacionEj1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Launcher {

	/*
	 * Se desea crear un programa que procese ficheros aprovechando el paralelismo
	 * de la máquina. Se tienen cuatro ficheros con los siguientes nombres:
	 * informática.txt gerencia.txt contabilidad.txt comercio.txt En cada fichero
	 * hay una lista de cantidades enteras que representa las contabilidades de
	 * distintos departamentos. Hay una cantidad en cada línea. Se desea que el
	 * programa creado sume la cantidad total que suman todas las cantidades ENTRE
	 * DOS NÚMEROS introducidos como argumentos o parámetros y en los cuatro
	 * ficheros haciendo uso del paralelismo. Es decir, en cada fichero solo sumará
	 * las cantidades que estén entre dos números escogidos por el usuario y pasados
	 * como parámetros.
	 */
	public static void main(String[] args) {

		//En la carpeta que tengo de resultados usé como limitantes el 0 como mínimo y el 100 como máximo
		/*
		 * El nombre de los ficheros de entrada, salida y error
		 * LOS RESULTADOS SERÁN GUARDADOS AL MISMO NIVEL QUE LA CARPETA SRC
		 */
		String[] fichiEnt = { "informatica.txt", "comercio.txt", "gerencia.txt",  "contabilidad.txt" };
		String[] fichiSal = { "RafaTinformatica.txt", "RafaTcomercio.txt", "RafaTgerencia.txt", 
				"RafaTcontabilidad.txt" };
		String[] fichiErr = { "RafaEinformatica.txt", "RafaEcomercio.txt", "RafaEgerencia.txt", 
				"RafaEcontabilidad.txt" };

		/*
		 * Valores mínimos y maximos que tendremos en cuenta
		 */
		Scanner src = new Scanner(System.in);
		System.out.println("Introduce un valor el cual se tiene que alcanzar");
		String cantidadMinima = src.next();
		System.out.println("Introduce un valor el cual no se puede superar");
		String cantidadMaxima = src.next();

		/*
		 * Con estas dos lineas nos encargamos de la ruta
		 */
		String path = System.getProperty("user.dir");
		String ruta = "\\src\\RecuperacionEj1\\";

		/*
		 * Generamos los tres processBuilder por donde le pasamos toda la información
		 */
		for (int i = 0; i < fichiEnt.length; i++) {
			ProcessBuilder pb;
			pb = new ProcessBuilder("java", path + ruta + "Calculadora.java", fichiEnt[i], fichiSal[i],
					String.valueOf(cantidadMinima),String.valueOf(cantidadMaxima));
			pb.redirectError(new File("Error" + fichiEnt[i]));
			try {
				pb.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}
		for (int i = 0; i < fichiEnt.length; i++) {
			try {
				// BufferedReader br = Calculadora.getBufferedReader(fichiSal[i]);
				int br = Calculadora.EntreDosNumeros(fichiEnt[i], fichiSal[i], Integer.parseInt(cantidadMinima),  Integer.parseInt(cantidadMaxima));
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (NumberFormatException a) {
				a.printStackTrace();
			} catch (IOException a) {
				a.printStackTrace();
			}
		}

	}

}
