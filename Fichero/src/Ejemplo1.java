
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ejemplo1 {

	public static void main(String[] args) throws IOException {
	Scanner src= new Scanner(System.in);
	System.out.println("Introduce el nombre del directorio");
	
	//String directorio="C:\\Users\\rafae\\OneDrive\\Escritorio\\Apuntes de cosas chidas\\Sql\\RafaExamen\\"+palabra;
	
	
	File obama= new File("Directorio");
	
	 
		obama.mkdirs();
	      System.out.println("El directorio se ha creado con éxito.");
	    
	    	 File file1 = new File("Directorio\\Archivo1.txt");
	    	 File file2 = new File("Directorio\\Archivo2.txt");
	    	 try {
	    		 file1.createNewFile();
	    		 file2.createNewFile();
	    	 }catch (Exception e) {
				// TODO: handle exception
			}
	    	 
	    	String nombre= JOptionPane.showInputDialog(null, "Introduzca el nuevo nombre de fichero 1");
	    	 file1.renameTo(new File("Directorio\\"+nombre));
	
	    	 
	    	file2.delete();
	}
}
