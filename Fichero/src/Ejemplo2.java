import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 2o) Codificar un programa que cree el fichero Texto.txt, después copiará
		 * determinados datos seleccionados de dicho fichero, almacenándolos en otro
		 * fichero Copia.txt. La selección consiste en que de cada 3 caracteres leídos
		 * se escribirá uno.
		 */
		File file= new File("Texto.txt");
		FileWriter Escriba= new FileWriter(file);
		for(int i=0; i<10; i++) {
			Escriba.write("Lineas "+i +" ");
		}
		
		Escriba.close();
		FileReader lector = new FileReader(file);
		File file2 = new File("Copia.txt");
		FileWriter aabc= new FileWriter(file2);
		BufferedReader a= new BufferedReader(lector);
		BufferedWriter b = new BufferedWriter(aabc);
		int caracter;
        int contador = 0;
        
        // Leer caracteres del archivo de origen y escribir cada tercer caracter en el archivo de destino
        while ((caracter = a.read()) != -1) {
            // Si el contador es múltiplo de 3, escribir el caracter en el archivo de destino
            if (contador % 3 == 0) {
                b.write(caracter);
            }
            contador++;
        }
file2.createNewFile();
  
	Escriba.close();
	 a.close();
     b.close();
	}
}
