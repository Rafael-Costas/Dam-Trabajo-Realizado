package ManejoDeFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * 1o) Crea un fichero de texto con el nombre y contenido que tú quieras. Crea
		 * otro método para leer el fichero anterior carácter a carácter mostrando su
		 * contenido en pantalla sin espacios y escribiendo dicho contenido en otro
		 * fichero en el disco. Por ejemplo el fichero tiene el siguiente texto: “Crea
		 * un fichero de texto con el nombre y contenido que tú quieras” deberá mostrar
		 * por pantalla Creaunficherodetextoconelnombreycontenidoquetúquieras.
		 */
		File abc = new File("Ejercicio1,1");
		Scanner src=new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter(abc);
			System.out.println("Escribe lo que quiereas que aparezca");
			String frase= src.nextLine();
			fw.write(frase);
			fw.close();
			FileReader fr= new FileReader(abc);
			String [] arr=frase.split(" ");
			BufferedReader br=new BufferedReader(fr);
			
			File archivo2 = new File("Ejer1Solucion");
			FileWriter fw2 = new FileWriter(archivo2);
			for(int i=0; i<arr.length; i++) {
				fw2.write(arr[i]);
			}
			fw2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
