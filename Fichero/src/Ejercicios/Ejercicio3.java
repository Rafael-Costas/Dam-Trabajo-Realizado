package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		/*
		 * 3. Crea un programa en Java que lea el contenido de un archivo de que indique
		 * el usuario y reemplace todas las ocurrencias de una palabra por otra. Ambas
		 * palabras serán solicitadas al usuario. El resultado debe guardarse en otro
		 * archivo de texto llamado "reemplazo.txt"
		 */
		Scanner src = new Scanner(System.in);

		System.out.println("Introduce que palabra quieres cambiar ");
		String victima = src.nextLine();
		System.out.println("Introduce que palabra quieres que la cambie ");
		String sustito = src.nextLine();
		JFileChooser jchooser = new JFileChooser();

		JOptionPane joption = new JOptionPane();

		int seleccion = jchooser.showOpenDialog(null);

		if (seleccion == jchooser.APPROVE_OPTION) {
			File a = jchooser.getSelectedFile().getAbsoluteFile();
			FileReader fr = new FileReader(a);
			BufferedReader br = new BufferedReader(fr);
			File reemplazo = new File("reemplazo.txt");
			FileWriter fw = new FileWriter(reemplazo);
			String frase;
			while ((frase = br.readLine()) != null) {
				String[] arr = frase.split(" ");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].equals(victima)) {
						arr[i] = sustito;
					}
					fw.write(arr[i]);
					fw.write(" ");

				}
				fw.write("\n");

				// System.out.println(" ");

			}
			fw.close();

		}

	}

}
