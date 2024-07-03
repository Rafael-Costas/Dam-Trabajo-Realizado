package Ejercicioz2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;



public class Launcher {
	/*
	 * Crear un programa que sea capaz de contar cuantas letras de un determinado
	 * tipo hay en un fichero. El programa padre debe lanzar TRES procesos hijo,
	 * donde cada uno de ellos se ocupará de contar una letra concreta (SOLO
	 * Minúscula Y ALEATORIA) pasada como parámetro.
	 * 
	 * 
	 * 
	 * 
	 * Es decir, en el fichero buscará una letra minúscula aleatoria.
	 * 
	 * 
	 * 
	 * 
	 * Cada subproceso que cuenta letras deberá dejar el resultado en un fichero. El
	 * programa padre se ocupará de recuperar los resultados de los ficheros, sumar
	 * todos los subtotales y mostrar el resultado final en pantalla, guardando con
	 * posterioridad el mismo.
	 * 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		String entrada = "textoB.txt";// args[0];
		Random r= new Random();
		/*
		 * String classpathUtilidades; classpathUtilidades = args[1];
		 */
		String[] abecedario = {"a","e","i","o","u","b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

		
		// C:\\ruta hasta contador .java
		String ruta = "\\src\\Ejercicioz2\\Contador.java";
		// OJO MAYUSCULAS Y MINUSCULAS
		String letra1=abecedario[r.nextInt(27)];
		String letra2=abecedario[r.nextInt(27)];
		String letra3=abecedario[r.nextInt(27)];
		
		String [] letrasElegidas =  {letra1, letra2, letra3};
		// revisar
		String classPath = System.getProperty("user.dir");

	
		System.out.println("Usando ruta:" + ruta);
		System.out.println("Usando classPath: " + classPath);
		System.out.println("classpath + ruta " + classPath + ruta);
		
		for (int i = 0; i < 3; i++) {
		
			String fichErrores = "Errores_" + letrasElegidas[i] + ".txt";
			ProcessBuilder pb;
			pb = new ProcessBuilder("java", classPath + ruta, entrada,
					letrasElegidas[i], letrasElegidas[i] + ".txt");
			// Si hay algún error, almacenarlo en un fichero
			pb.redirectError(new File(fichErrores));
			pb.start();
			// fin del for
		}
		
		Thread.sleep(1000);
		String res= "ZresConsonantes.txt";
		File f = new File("ZresConsonantes.txt");
		PrintWriter pw = Contador.getPrintWriter(res);
		for(int i=0; i<3; i++) {
			String cad= "El numero de "+letrasElegidas[i]+" es: " +getResultadoFichero(letrasElegidas[i]+".txt");
			System.out.println(cad);
			pw.append(cad+"\n");
		}
		int total=getResultadoFichero(letrasElegidas[0]+".txt")+getResultadoFichero(letrasElegidas[1]+".txt")+getResultadoFichero(letrasElegidas[2]+".txt");
		System.out.println("El total de la suma de dichas letras es de "+total);
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

