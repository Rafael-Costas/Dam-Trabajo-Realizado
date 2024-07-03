package Ejercicios;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;

public class EjercicioPlus {

	public static void main(String[] args) {
		JFileChooser jfc= new JFileChooser();
		
		int seleccion = jfc.showOpenDialog(null);
		  jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
		File archivo = jfc.getSelectedFile();
		System.out.println(archivo.getName());
		if (seleccion == jfc.APPROVE_OPTION) {
			
		
			File[]arr=archivo.listFiles();
			for(int i=0; i<arr.length; i++) {
				System.out.println( arr[i].getName());
			}
			System.out.println(archivo.getName());
	
		}
		}
}
