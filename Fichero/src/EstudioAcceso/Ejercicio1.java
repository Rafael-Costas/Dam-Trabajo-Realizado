package EstudioAcceso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		/*
		 *  En la primera deberá crear un fichero (con el nombre que se quiera) en el
		 * que indicaremos en líneas diferentes tu nombre, tus apellidos, tu ciudad de
		 * nacimiento.
		 *   En la segunda opción deberá mostrar por pantalla el contenido
		 * del fichero creado.
		 *   En la tercera opción crearemos un fichero cuyo nombre y
		 * contenido introducimos por teclado. Después de crear el fichero con la
		 * información introducida, se deberá mostrar por pantalla el texto del fichero
		 * variando entre mayúsculas y minúsculas. Por ejemplo, si escribo Bienvenidos a
		 * Vigo deberá mostrar bIENVENIDOS A vIGO.
		 */
		Scanner src= new Scanner(System.in);
		int opc=0;
		String archivo="";
		while(opc!=-1) {
		System.out.println("Que quieres hacer?");
		System.out.println("Introduce 1 para un registro de ti");
		System.out.println("Introduce 2 para mostrar la información del fichero creado");
		System.out.println("Introduce 3, cosa larga");
		opc=src.nextInt();
		String frase="";
		if(opc==1) {
			System.out.println("Introduce el nombre del archivo");
			archivo=src.next();
			File file= new File(archivo+".txt");
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			System.out.println("Introduce tu nombre");
		frase=src.next();
			fileWriter.write("Tu nombre es "+frase+" ");
			
			fileWriter.write("\n");
			System.out.println("Introduce tu lugar de nacimiento");
			frase=src.next();
				fileWriter.write("Naciste en "+frase);
				fileWriter.close();
		}
		if(opc==2) {
			if(archivo!="") {
				FileReader fr = new FileReader(archivo+".txt");
				BufferedReader bf = new BufferedReader(fr);
				String res="";
				while((res=bf.readLine())!=null) {
					System.out.println(res);
				}
			}else {
				System.out.println("No creaste archivo");
			}
		}
		}
		
		}
}
