package Ejemplo5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LauncherConsonantes {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		 * 1. Recoger el primer parámetro (args[0]), que contendrá el fichero a
		 * procesar. 2. Recoger el segundo parámetro, que contendrá el directorio
		 * de“CLASSPATH” donde habrá que buscar la clase “UtilidadesFicheros”.
		 * ???????????? 3. Recogr el tercer parámetro, que contendrá el directorio donde
		 * habrá que buscar la clase “ProcesadorFicheros”. 4. Una vez recogidos los
		 * parámetros, se lanzarán los procesos utilizando la clase “ProcessBuilder”. 5.
		 * Los procesos se ejecutarán y después recogeremos los resultados de los
		 * ficheros.
		 */
		// Fichero Himno.txt
		String entrada = "Himno.txt";// args[0];
		/*
		 * String classpathUtilidades; classpathUtilidades = args[1];
		 */

		// C:\\ruta hasta contador .java
		String ruta = "\\src\\Ejemplo5\\Contador.java";
		// OJO MAYUSCULAS Y MINUSCULAS
		
	String[] consonantes = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		// revisar
		String classPath = System.getProperty("user.dir");

	
		System.out.println("Usando ruta:" + ruta);
		System.out.println("Usando classPath: " + classPath);
		System.out.println("classpath + ruta " + classPath + ruta);

		for (int i = 0; i < consonantes.length; i++) {
			String fichErrores = "Errores_" + consonantes[i] + ".txt";
			ProcessBuilder pb;
			pb = new ProcessBuilder("java", classPath + ruta, entrada,
					consonantes[i], consonantes[i] + ".txt");
			// Si hay algún error, almacenarlo en un fichero
			pb.redirectError(new File(fichErrores));
			pb.start();
			// fin del for
		}
		
		Thread.sleep(1000);
		String res= "resConsonantes.txt";
		File f = new File("resConsonantes.txt");
		PrintWriter pw = Contador.getPrintWriter(res);
		for(int i=0; i<consonantes.length; i++) {
			String cad= "El numero de "+consonantes[i]+" es: " +getResultadoFichero(consonantes[i]+".txt");
			System.out.println(cad);
			pw.append(cad+"\n");
		}
		pw.close();
	}
	public static int getResultadoFichero(String nombreFichero) {
		int suma = 0;
		try {
			
			FileInputStream fichero = new FileInputStream(nombreFichero);
			InputStreamReader fir = new InputStreamReader(fichero);
			BufferedReader br = new BufferedReader(fir);
			// SOLO LEE UNA LINEA
			String linea = br.readLine();
			suma = Integer.parseInt(linea);
			return suma;
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir " + nombreFichero);
		} catch (IOException e) {
			System.out.println("No hay nada en " + nombreFichero);
		}
		return suma;
	}
}
