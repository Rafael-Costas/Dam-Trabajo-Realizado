package Inicio;

import java.net.*;
import java.io.*;

public class Ejemplo2URL {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("https://www.cebem.net/index.php/es/ciclos-fp/grado-medio/gestio-administrativa");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		BufferedReader br;
		try {
			InputStream inputstream = url.openStream();
			br = new BufferedReader(new InputStreamReader(inputstream));
			String inputLine;
			while ((inputLine = br.readLine()) != null)
				System.out.println(inputLine);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// Fin de main
}// Fin de Ejemplo2URL