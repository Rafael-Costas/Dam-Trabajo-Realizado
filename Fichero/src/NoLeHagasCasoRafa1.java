import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class NoLeHagasCasoRafa1 {

	public static void main(String[] args) {
		/*
		 * Ejercicio de Ficheros de Texto Codificar un programa en Java que muestre un
		 * menú con 3 opciones:  En la primera deberá crear un fichero (con el nombre
		 * que se quiera) en el que indicaremos en líneas diferentes tu nombre, tus
		 * apellidos, tu ciudad de nacimiento.  En la segunda opción deberá mostrar por
		 * pantalla el contenido del fichero creado.  En la tercera opción crearemos un
		 * fichero cuyo nombre y contenido introducimos por teclado. Después de crear el
		 * fichero con la información introducida, se deberá mostrar por pantalla el
		 * texto del fichero variando entre mayúsculas y minúsculas. Por ejemplo, si
		 * escribo Bienvenidos a Vigo deberá mostrar bIENVENIDOS A vIGO.
		 */
		Scanner src= new Scanner(System.in);
		File usuario=null;
		
		
		int opc;
		do {
			System.out.println("Elige una opción");
			System.out.println("1 Crea un fichero");
			System.out.println("2 Muestra la información");
			System.out.println("3 Genera tu el fichero");
			System.out.println("4 Largarse");
			opc=src.nextInt();
		switch(opc) {
		case 1:
			usuario=crearFicheroDatosUsuario();
			
		break;
		case 2:
			if(usuario!=null && usuario.exists()) {
				mostrarFichero(usuario);
			}
			else {
				System.out.println("El fichero no existe");
			}
		
			
			break;
		case 3:
			if(usuario!=null && usuario.exists()) {
				try {
					usuario=alternarMayusculas(usuario);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			break;
		
		case 4:
			System.out.println("Hasta luego");
			break;
		}
	
		
		}while(opc !=4);
	}
	public static File crearFicheroDatosUsuario() {
		File file1= new File("Usuario.txt");	
		Scanner src= new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter(file1);
			System.out.println("introduce tu nombre");
			String nombre=src.nextLine();
			fw.write(nombre+", ");
			System.out.println("introduce tu apellido");
			String apellido=src.nextLine();
			fw.write(apellido+", ");
			System.out.println("introduce tu lugar de nacimiento");
			String nacimiento=src.nextLine();
			fw.write(nacimiento);
			fw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file1;
	}
	public static void mostrarFichero(File fichero) {
		try {
			FileReader fr=new FileReader(fichero);
			BufferedReader br=new BufferedReader(fr);
			String linea;
			try {
				while((linea=br.readLine())!=null) {
					System.out.println(linea);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static File alternarMayusculas(File fichero) throws IOException {
		try {
			FileReader fr=new FileReader(fichero);
			FileWriter fw = new FileWriter(fichero);
			BufferedReader br=new BufferedReader(fr);
			String linea;
			String aux="";
			try {
				
				while((linea=br.readLine())!=null) {
					
					for(int i=0; i<linea.length(); i++) {
						aux+=linea.charAt(i);
						if(i%2==0) {
							aux.toUpperCase().charAt(i);
							fw.write(aux);
							System.out.println("a");
						}else {
							aux.toLowerCase().charAt(i);
							fw.write(aux);
							System.out.println("b");
						}
					fw.write(" ");
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			br.close();
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fichero;
	}
}
