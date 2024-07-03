package AlgoRaro;

import java.io.File;

public class LeerCarpeta {

	public static void main(String[] args) {
		File directorio = new File("C:\\Users\\rafae\\eclipse-workspace\\3Temporada\\src");
		String [] archivos = directorio.list();
		for(int i=0; i<archivos.length; i++) {
			System.out.println("Archivo: "+archivos[i]);
		}
	}
}
