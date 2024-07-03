package usoDeFicheros;
import java.io.*;
public class Ficheros {

	public static void main(String[] args)  {
		FileInputStream fis = null;
		DataInputStream das = null;
		int coso;
		FileOutputStream fos = null;
		DataOutputStream dos =null;
	File fichero = new File("data.dat");	
	int [] numero = {1,2,3,4,5,6,7,8,9,10};	
	try {
			fos = new FileOutputStream(fichero, true);
			dos = new DataOutputStream(fos);
			for (int i : numero) {
				dos.writeInt(i);
			}
		}catch(IOException e) {
			System.out.println("No se pudo escribir en el fichero");
		}catch(Exception a) {
			System.out.println("Coso");
		}finally {
			try {
				fos.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	try {
		fis = new FileInputStream("data.dat");
		das = new DataInputStream(fis);
		boolean cosita =true;
		while (das.available()!=0){
			
			System.out.println ("Numero: "+das.readInt());
			
			}
	}catch(Exception a) {
		a.printStackTrace();
	}finally{
		
		try {
			fis.close();
			das.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	}
}

