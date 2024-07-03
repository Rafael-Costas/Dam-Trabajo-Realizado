package Estudio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Ejercicio1 {

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
		JFileChooser fileChooser= new JFileChooser();
		fileChooser.showOpenDialog(null);
		File fl = new File(fileChooser.getSelectedFile().getAbsolutePath());
		fileChooser.showOpenDialog(null);
		File f2 = new File(fileChooser.getSelectedFile().getAbsolutePath());
		FileReader fr = new FileReader(fl);
		FileReader fr2 = new FileReader(f2);
		BufferedReader bf= new BufferedReader(fr);
		BufferedReader bf2= new BufferedReader(fr2);
	
		FileWriter fw = new FileWriter("Estudio.txt");
		String frasecita;
		while ((frasecita=bf.readLine())!=null) {
			fw.write(frasecita+"\n");
			if((frasecita=bf2.readLine())!=null) {
				fw.write(frasecita+"\n");
			}
			
			
		}
		
		while((frasecita=bf2.readLine())!=null){
			fw.write(frasecita+"\n");
		}
		fw.close();
	}
}
