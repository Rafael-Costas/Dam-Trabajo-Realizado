package FileChoo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;;

public class Binario {

	public static void main(String[] args) {
		// declaramos los objetos FileOutputStream y

		FileOutputStream fe;
		DataOutputStream ds = null;
		try {
			// array de enteros
			double[] array = { 5.25, 145.18, 2.37, 143.12, 147.10,

					169.19, 47.65 };

			fe = new java.io.FileOutputStream("Decimales.txt", false);
			ds = new DataOutputStream(fe);

			for (double i : array) {
				ds.writeDouble(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el fichero Enteros.txt");

		} catch (IOException e) {
			System.out.println("No se pudo escribir en el fichero Enteros.txt");
		} finally {
			try {
				ds.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
