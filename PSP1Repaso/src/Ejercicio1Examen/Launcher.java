package Ejercicio1Examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;



public class Launcher {
	/*
	
	 * Se desea crear un programa que procese ficheros aprovechando el paralelismo
	 * de la máquina. Se tienen cuatro ficheros con los siguientes nombres:
	
	 * informática.txt gerencia.txt contabilidad.txt comercio.txt
	
	 * En cada fichero hay una lista de cantidades enteras que representa las
	 * contabilidades de distintos departamentos. Hay una cantidad en cada línea. Se
	 * desea que el programa creado sume la cantidad total que suman todas las
	 * cantidades INFERIORES a un determinado número introducido como argumento o
	 * parámetro en los cuatro ficheros haciendo uso del paralelismo.

	 * Es decir, en cada fichero solo sumará las cantidades que sean inferiores a un
	 * determinado número escogido por el usuario y pasado como parámetro.
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] fichiEnt = { "informatica.txt", "comercio.txt", "gerencia.txt", "rrhh.txt", "contabilidad.txt" };
		String[] fichiSal = { "Tinformatica.txt", "Tcomercio.txt", "Tgerencia.txt", "Trrhh.txt", "Tcontabilidad.txt" };
		String[] fichiErr = { "Einformatica.txt", "Ecomercio.txt", "Egerencia.txt", "Errhh.txt", "Econtabilidad.txt" };

	

		String path = System.getProperty("user.dir");
		String cantidad="1000";
		String ruta="\\src\\Ejercicio1Examen\\";
		System.out.println(path+ruta);
		
/*		ProcessBuilder pb ;
			pb= new ProcessBuilder("java",path+ruta+ "Calculadora.java", "informatica.txt",	 "Tinformatica.txt");
			pb.redirectError(new File("Errhh.txt"));
	*/		 
		for(int i=0; i<fichiEnt.length; i++) { 
			ProcessBuilder pb ;
			pb= new ProcessBuilder("java",path+ruta+ "Calculadora.java", fichiEnt[i], fichiSal[i] ); 
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
				BufferedReader br = Calculadora.getBufferedReader(fichiSal[i]);
				 parcial = Integer.parseInt(br.readLine());
				if(parcial>1000) {
					ricos+=parcial;
				}
				 total+=parcial;
				 System.out.println("gastos "+fichiEnt[i]+": "+parcial );
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(NumberFormatException a) {
				a.printStackTrace();
			}catch(IOException a) {
				a.printStackTrace();
			}
		}
	System.out.println("gastos totales"+total);
	System.out.println("Guardando en totaltes.txt");
	System.out.println("Los ricos tienen en total "+ricos);
	try {
		PrintWriter pw = Calculadora2.getPrintWriter("gastostotales.txt");
		
		pw.println(String.valueOf(total));
		pw= Calculadora.getPrintWriter("Ricos.txt");
		pw.println(String.valueOf(ricos));
		pw.close();
	}catch (Exception e) {
		// TODO: handle exception
	}
	}

	
}


