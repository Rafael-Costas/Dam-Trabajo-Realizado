package Ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 2. Realiza un programa en Java donde introduzcas la ruta de un fichero por
		 * teclado y un texto que queramos a escribir en el fichero con
		 * JOptionPane.showInputDialog Posteriormente, muestra el contenido del fichero.
		 */
		JFileChooser jchooser = new JFileChooser();
		
		JOptionPane joption= new JOptionPane();
		
		int seleccion = jchooser.showOpenDialog(null);
		
		if(seleccion==jchooser.APPROVE_OPTION) {
			File archivo = jchooser.getSelectedFile();
			
			
			FileWriter fw =new FileWriter(archivo);
			String frase=joption.showInputDialog("Escribe lo que quieres guardar en el archivo");
			
			fw.write(frase);
			fw.close();
		}
		
	
		
	}
}
