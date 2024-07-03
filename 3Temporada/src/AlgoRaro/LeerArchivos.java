package AlgoRaro;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerArchivos {

	public static void main(String[] args) throws Exception {

		String nombreArchivo = "C:\\Users\\rafae\\eclipse-workspace\\3Temporada\\src\\AlgoRaro\\prueba.txt";

		FileInputStream archivo; // Definición de flujo de datos
		InputStreamReader conversor; // Definición del flujo de lectura
		BufferedReader filtro; // Definicion del buffer
		String linea;

		try {
			// Crea los objetos FileInputStream, BufferReader y Buffered
			archivo = new FileInputStream(nombreArchivo);
			conversor = new InputStreamReader(archivo);
			filtro = new BufferedReader(conversor);
			linea = filtro.readLine();
			while (linea != null) {
				System.out.println(linea); // Imprime en pantalla una línea del archivo
				linea = filtro.readLine(); // Lee la siguiente línea
			}
			filtro.close();// Cierra el archivo
		} catch (IOException e) { // En caso que se genere una excepción
			System.out.println("No se pudo leer el archivo");
		}
	}
}
