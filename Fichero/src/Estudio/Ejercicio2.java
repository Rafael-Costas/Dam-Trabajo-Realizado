package Estudio;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 2. Realiza un programa en Java donde introduzcas la ruta de un fichero por
		 * teclado y un texto que queramos a escribir en el fichero con
		 * JOptionPane.showInputDialog Posteriormente, muestra el contenido del fichero.
		 */
		Scanner src= new Scanner(System.in);
		String frase=src.nextLine();
		System.out.println(frase);
		File file= new File(frase);
		file.createNewFile();
		JOptionPane jOptionPane = new JOptionPane();
		
		 frase=jOptionPane.showInputDialog("Escribe lo que quieres guardar en el archivo");
		FileReader fileReader = new FileReader(file);
		
		FileWriter fileWriter = new FileWriter(file, true);
		fileWriter.write(frase);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		fileWriter.close();
		while((frase=bufferedReader.readLine())!=null) {
			System.out.println(frase);
		}
	}
}
