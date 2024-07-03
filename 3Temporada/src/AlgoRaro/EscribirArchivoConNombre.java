package AlgoRaro;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirArchivoConNombre {

	public static void main(String[] args) {
		FileWriter archivo= null;
		PrintWriter impresor= null;
		String nombre = null;
		Scanner src= new Scanner(System.in);
		System.out.println("Nombre del fichero");
		String frase= null;
		nombre=src.nextLine();
		try{
			archivo = new FileWriter("C:\\Users\\rafae\\eclipse-workspace\\3Temporada\\src\\AlgoRaro\\"+nombre+".txt");
			impresor = new PrintWriter(archivo);
			for(int i=0; i<10; i++) {
				frase=src.nextLine();
				impresor.println(frase);
				
			}
			}catch ( Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(archivo !=null) 
						archivo.close();
					}catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			
		}
	}
