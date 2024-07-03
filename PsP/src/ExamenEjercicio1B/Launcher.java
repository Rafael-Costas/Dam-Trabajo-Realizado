package ExamenEjercicio1B;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Launcher {
/*
 * Los ficheros de salida que trendrán serán dos, en caso de que todo salga bien el fichero RafaT[archivosumado].txt y en caso contrario saldrá RafaE[archivosumado].txt
 */
/*
 * Los resultados en de caso de introducir como valor máximo 300 es este:
 * El total de informatica.txt es: 100 $
gastos informatica.txt: 100
El total de comercio.txt es: 710 $
gastos comercio.txt: 710
El total de gerencia.txt es: 250 $
gastos gerencia.txt: 250
El total de rrhh.txt es: 250 $
gastos rrhh.txt: 250
El total de contabilidad.txt es: 0 $
gastos contabilidad.txt: 0
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] fichiEnt = { "informatica.txt", "comercio.txt", "gerencia.txt", "rrhh.txt", "contabilidad.txt" };
		String[] fichiSal = { "RafaTinformatica.txt", "RafaTcomercio.txt", "RafaTgerencia.txt", "RafaTrrhh.txt", "RafaTcontabilidad.txt" };
		String[] fichiErr = { "RafaEinformatica.txt", "RafaEcomercio.txt", "RafaEgerencia.txt", "RafaErrhh.txt", "RafaEcontabilidad.txt" };

		System.out.println("Introduce un valor el cual no se puede superar");
		Scanner src= new Scanner(System.in);
		String cantidad=src.next();

		String path = System.getProperty("user.dir");
		String ruta="\\src\\ExamenEjercicio1B\\";
	
		
/*		ProcessBuilder pb ;
			pb= new ProcessBuilder("java",path+ruta+ "Calculadora.java", "informatica.txt",	 "Tinformatica.txt");
			pb.redirectError(new File("Errhh.txt"));
	*/		 
		for(int i=0; i<fichiEnt.length; i++) { 
			ProcessBuilder pb ;
			pb= new ProcessBuilder("java",path+ruta+ "Calculadora.java", fichiEnt[i], fichiSal[i], String.valueOf(cantidad) ); 
			pb.redirectError(new File("Error"+fichiEnt[i]));
			try {
				pb.start();
			}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	int parcial =0;
	int total=0;
	int ricos=0;
	try {
		Thread.sleep(500);
	}catch(InterruptedException e) {
		
	}
		for(int i=0; i<fichiEnt.length; i++) {
			try {
				//BufferedReader br = Calculadora.getBufferedReader(fichiSal[i]);
				int br = Calculadora.hacerCalculosCondiciones(fichiEnt[i],fichiSal[i],Integer.parseInt(cantidad));
				 parcial = br;
				if(parcial<Integer.parseInt(cantidad) ) {
					ricos+=parcial;
					total+=parcial;
				}
				 System.out.println("gastos "+fichiEnt[i]+": "+parcial );
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(NumberFormatException a) {
				a.printStackTrace();
			}catch(IOException a) {
				a.printStackTrace();
			}
		}
	
	
	}

	
}
