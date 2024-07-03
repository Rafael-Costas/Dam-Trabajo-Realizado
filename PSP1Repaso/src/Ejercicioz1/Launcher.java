package Ejercicioz1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Launcher {
public static void main(String[] args) {
	String[] fichiEnt = { "informatica.txt", "comercio.txt", "gerencia.txt", "rrhh.txt", "contabilidad.txt" };
	String[] fichiSal = { "Tinformatica.txt", "Tcomercio.txt", "Tgerencia.txt", "Trrhh.txt", "Tcontabilidad.txt" };
	String[] fichiErr = { "Einformatica.txt", "Ecomercio.txt", "Egerencia.txt", "Errhh.txt", "Econtabilidad.txt" };


Scanner src= new Scanner(System.in);
	String path = System.getProperty("user.dir");
	
	System.out.println("Introduce una cantidad");
	int cantidad=src.nextInt();
	String ruta="\\src\\Ejercicioz1\\";
	System.out.println(path+ruta);
	
/*		ProcessBuilder pb ;
		pb= new ProcessBuilder("java",path+ruta+ "Calculadora.java", "informatica.txt",	 "Tinformatica.txt");
		pb.redirectError(new File("Errhh.txt"));
*/		 
	for(int i=0; i<fichiEnt.length; i++) { 
		ProcessBuilder pb ;
		pb= new ProcessBuilder("java",path+ruta+ "Calculadora.java", fichiEnt[i], fichiSal[i], String.valueOf(cantidad) ); 
		pb.redirectError(new File("ErrorZ"+fichiEnt[i]));
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



}
}
