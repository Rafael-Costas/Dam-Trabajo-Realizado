package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EJercicio1 {

	public static void main(String[] args) throws IOException {
		/*
		 * 1. Escribe un programa que guarde en un fichero el contenido de otros dos
		 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de
		 * los primeros dos ficheros mezcladas, es decir, la primera línea será del
		 * primer fichero, la segunda será del segundo fichero, la tercera será la
		 * siguiente del primer fichero, etc.
		 * 
		 * · Los nombres de los dos ficheros origen y el nombre del fichero destino se
		 * deben pasarse por texto o bien emplear JFileChooser · Hay que tener en cuenta
		 * que los ficheros dedonde se van cogiendo las líneas pueden tener tamaños
		 * diferentes en cuanto al número de líneas.
		 */

		Scanner src = new Scanner(System.in);
		System.out.println("Introduce el nombre del primer fichero?");
		String nombre = src.next();
		File Fichero1 = new File(nombre + ".txt");
		System.out.println("Introduce el nombre del segundo fichero?");
		nombre = src.next();
		File Fichero2 = new File(nombre + ".txt");
		System.out.println("Introduce el nombre del tercer fichero?");
		nombre = src.next();
		File solucion = new File(nombre + ".txt");

		solucion.createNewFile();
		Fichero1.createNewFile();
		Fichero2.createNewFile();

		FileWriter fw = new FileWriter(Fichero1);
		FileWriter fw2 = new FileWriter(Fichero2);
		FileWriter fw3 = new FileWriter(solucion);

		FileReader fr = new FileReader(Fichero1);
		FileReader fr2 = new FileReader(Fichero2);

		BufferedReader lector = new BufferedReader(fr);
		BufferedReader lector2 = new BufferedReader(fr2);
		String linea = "";
		String cosita = "";

		try {
			for (int i = 0; i < 10; i++)
				fw.write("Pepe \n");

			for (int i = 0; i < 15; i++)
				fw2.write("Antonio \n");

			fw.close();
			fw2.close();
			while ((linea = lector.readLine()) != null) {
				fw3.write(linea + "\n");
				if ((cosita = lector2.readLine()) != null) {
					fw3.write(cosita + "\n");
				}
			}

			while ((cosita = lector2.readLine()) != null) {
				fw3.write(cosita + "\n");
			}

			lector = new BufferedReader(fr2);
			while ((linea = lector.readLine()) != null)
				System.out.println(linea);

			System.out.println("Todo en orden");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Ha petao");
		}
		fw3.close();

	}
}
