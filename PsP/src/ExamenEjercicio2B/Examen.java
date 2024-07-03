package ExamenEjercicio2B;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;


public class Examen {
public static void main(String[] args) {

	
	//LEEEEEEEEER
	
	
	String entrada = "textoB.txt";// args[0];
	


	String ruta = "\\src\\ExamenEjercicio2B\\Contador.java";
	
	
String[] abecedario = {"a","i","o","u","e","b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
	// revisar
	

String classPath = System.getProperty("user.dir");
	Random r = new Random();
	
	String letra1=abecedario[r.nextInt(27)];
	String letra2=abecedario[r.nextInt(27)];
	String letra3=abecedario[r.nextInt(27)];
	
	String [] letrasElegidas =  {letra1, letra2, letra3};

	/*
	 * Los ficheros de salida serán parecidos a los de  clase, aparecerán R[letra].txt y dentro tendrá el resultado
	 * Aparte en la consola aparecerá que letras han sido escogidas
	 * En mi caso un resultado es este 
	 * El numero de p es: 20
	   El numero de r es: 52
	   El numero de y es: 9
	 */
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
	String res= "resConsonantes.txt";
	File f = new File("resConsonantes.txt");
	PrintWriter pw;
	
	try {
		pw = Contador.getPrintWriter(res);
		for(int i=0; i<letrasElegidas.length; i++) {
			String cad= "El numero de "+letrasElegidas[i]+" es: " +getResultadoFichero("R"+letrasElegidas[i]+".txt");
			System.out.println(cad);
			pw.append(cad+"\n");
		}
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
