package Examen;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Ejercicio1 {

	public static void main(String[] args) {
		Random r = new Random();
		JFileChooser fileChooser = new JFileChooser();
		System.out.println("Introduce la cantidad de números aleatorios quieres");
		Scanner src= new Scanner(System.in);
		int num=src.nextInt();
		
		int seleccion = fileChooser.showOpenDialog(null);
		if(seleccion == JFileChooser.APPROVE_OPTION) {
			
			File file=  fileChooser.getSelectedFile();
			try {
				FileWriter fileWriter= new FileWriter(file, true);
				FileReader fileReader= new FileReader(file);
				
				
				for(int i=0; i<num; i++) {
					
					String res= r.nextInt(100)+" ";
					fileWriter.write(res);
					
				}
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(file.getName());
		}
	}
}
