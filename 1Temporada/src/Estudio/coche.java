package Estudio;

import java.util.Scanner;

public class coche {

	String marca;
	String modelo;
	coche(){
		this.marca="";
		this.modelo="";
	}
	@Override
	public String toString() {
		return "coche [marca=" + marca + ", modelo=" + modelo + "]";
	}
	coche(String mar, String mod){
		this.marca=mar;
		this.modelo=mod;
	}
	
	public void  setMarca(String m) {
		this.marca=m;
	}
	
	public void setModelo(String m) {
		this.modelo=m;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getMarca() {
		return this.marca;
	}
	public static void main(String[] args) {
		coche Azul= new coche();
		coche Rojo= new coche("Guapo", "Feo");
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce una marca");
		String marca=src.nextLine();
		System.out.println("Introduce un modelo");
		String modelo=src.next();
	System.out.println(Azul.toString());
	System.out.println(Rojo.toString());
	
	Azul.setMarca(marca);
	Azul.setModelo(modelo);
	System.out.println(Azul.toString());
	String info;
	info=Rojo.getMarca().concat(Rojo.getModelo());
	System.out.println(Rojo.getMarca()+ Rojo.getModelo());
	System.out.println(info);
	}
}
