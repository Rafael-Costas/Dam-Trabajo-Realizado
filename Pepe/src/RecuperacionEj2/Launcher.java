package RecuperacionEj2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;


public class Launcher {
	public static void main(String[] args) {

		
		//El el archivo de resultado lo que hice fue poner el archivo txt que usé
/*
 * 
 *  LOS RESULTADOS SERÁN GUARDADOS AL MISMO NIVEL QUE LA CARPETA SRC
 *  Aparte los archivos resultados serán (R"letra en mayúscula".txt) para los resultados de dichas letras por separado
 *   y RafaMayusculas.txt para el conjunto de dichas letras 
 */
	
		
		//Aquí tenemos el texto el array de las letras
		String entrada = "textoB.txt";// args[0];
	String[] abecedario = {"c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		
		
//las paso a mayusculas
	for(int i=0; i<abecedario.length; i++) {
		abecedario[i]=abecedario[i].toUpperCase();
	}
	
	//Formaré la direccion con classPath+ruta
	String classPath = System.getProperty("user.dir");
	String ruta = "\\src\\RecuperacionEj2\\Contador.java";
		
	Random r = new Random();
		
		String letra1=abecedario[r.nextInt(21)];
		String letra2=abecedario[r.nextInt(21)];
		String letra3=abecedario[r.nextInt(21)];
		
		String [] letrasElegidas =  {letra1, letra2, letra3};


		for (int i = 0; i < letrasElegidas.length; i++) {
			String fichErrores = "Errores_" + letrasElegidas[i] + ".txt";
			ProcessBuilder pb;
			pb = new ProcessBuilder("java", classPath + ruta, entrada,
					letrasElegidas[i], "R"+letrasElegidas[i] + ".txt");
			// Si hay algún error, almacenarlo en un fichero
			pb.redirectError(new File(fichErrores));
			try {
				pb.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// fin del for
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String res= "RafaMayusculas.txt";
		File f = new File("resConsonantes.txt");
		PrintWriter pw;
		
		try {
			pw = Contador.getPrintWriter(res);
			for(int i=0; i<letrasElegidas.length; i++) {
				String cad= "El numero de "+letrasElegidas[i]+" es: " +getResultadoFichero("R"+letrasElegidas[i]+".txt");
				System.out.println(cad);
				pw.append(cad+"\n");
			}
			int num1=getResultadoFichero("R"+letrasElegidas[0]+".txt");
			int num2=getResultadoFichero("R"+letrasElegidas[1]+".txt");
			int num3=getResultadoFichero("R"+letrasElegidas[2]+".txt");
		
			int total=num1+num2+num3;
			String cad;
			cad="El total de la suma de dichas letras es de "+total;
			System.out.println(cad);
			pw.append(cad);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
