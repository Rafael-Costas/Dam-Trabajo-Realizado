package EstudioPsp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;



public class Servidor1 {

	public static void main(String[] arg) throws IOException {
		int numeroPuerto = 6000;// Puerto
		ServerSocket servidor = new ServerSocket(numeroPuerto);
		String cad="";
		System.out.println("Esperando Conexion...");
		Socket ClienteConectado=servidor.accept();
		System.out.println("Cliente conectado");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter fsalida= new PrintWriter(ClienteConectado.getOutputStream(), true);
		BufferedReader fentrada = new BufferedReader(new InputStreamReader(ClienteConectado.getInputStream()));
		String cadena, eco="";
		String res="";
		String [] conjunto1 = null;
		String [] conjunto2 = null;
		Calendar calendar;
		String frase1="", frase2="";
		String ayuda="";
		while ((cad=fentrada.readLine())!=null) {
			
			if(frase2=="" && frase1!="") {
				frase2=cad;
			}
			if(frase1=="") {
				frase1=cad;
			}
		
			if(frase1!="" && frase2!="") {
				conjunto1=frase1.split(" ");
				conjunto2=frase2.split(" ");
					
			if(conjunto1.length>=conjunto2.length) {
				for(int i=0; i<conjunto1.length; i++) {
					res+=conjunto1[i]+" ";
					if(conjunto2.length>i) {
						res+=conjunto2[i]+" ";
					}
				}
			}else {
				for(int i=0; i<conjunto2.length; i++) {
					res+=conjunto2[i]+" ";
					if(conjunto1.length>i) {
						res+=conjunto1[i]+" ";
					}
				}
			}
		
		frase1="";
		frase2="";
		fsalida.print(res);
			}
		
			fsalida.println();
			if(cad.equals("quit"))break;
			
		}
	System.out.println("Cerrando conexion... ");
	fentrada.close();
	fsalida.close();
	ClienteConectado.close();
	servidor.close();
	}// main



}
//fin de Ejemplo1Servidor


