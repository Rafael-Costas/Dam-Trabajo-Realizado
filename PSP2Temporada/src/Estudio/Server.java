package Estudio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.commons.lang3.StringUtils;

public class Server {
public static void main(String[] args) throws IOException {
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
	
	Calendar calendar;
	String frase1 = "", frase2="";
	String conjunto2[];
	String conjunto1[];

	String ayuda="";
	while ((cad=fentrada.readLine())!=null) {
		if(frase1!="") {
			frase2+=cad;
			 conjunto2= frase2.split(" ");
		}
		if(frase2=="") {
		frase1+=cad;
		 conjunto1= frase1.split(" ");
		}
		
		System.out.println("Frase1: "+frase1);

		System.out.println("Frase2: "+frase2);
		if(frase2!="" && frase1!="") {
			conjunto1= frase1.split(" ");
			 conjunto2= frase2.split(" ");
			 
			 if(conjunto1.length>=conjunto2.length) {
				 for(int i=0; i<conjunto1.length; i++) {
						ayuda+=conjunto1[i]+" ";
					 if(conjunto2.length>i) {
						ayuda+= conjunto2[i]+" ";
					 }
					}	
				 fsalida.print(ayuda);
			 }else {
				 for(int i=0; i<conjunto2.length; i++) {
						ayuda+=conjunto2[i]+" ";
					 if(conjunto1.length>i) {
						ayuda+= conjunto1[i]+" ";
					 }
					}	
				 fsalida.print(ayuda);
			 }
		frase1="";
		frase2="";
		ayuda="";
		}

		/*
		//
		ayuda="";
		System.out.println("Recibiendo una palbra: "+cad);
		cad=cad.replace(" ", "");
		cad=cad.replace(",", "");
		StringBuilder sb= new StringBuilder(cad);
		ayuda=sb.reverse().toString();
		
		 StringUtils.stripAccents(cad);
		ayuda=ayuda.toLowerCase();
		cad=cad.toLowerCase();
		System.out.println(cad.trim());
		System.out.println(StringUtils.stripAccents(ayuda));
		System.out.println(cad);
		if(StringUtils.stripAccents(ayuda).compareTo(StringUtils.stripAccents(cad))==0) {
			fsalida.print("Es palindromo");
		}else {
			fsalida.print("No es palindromo");
		}
		
	*/
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