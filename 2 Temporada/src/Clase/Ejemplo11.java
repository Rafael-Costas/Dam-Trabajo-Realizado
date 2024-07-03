package Clase;

public class Ejemplo11 {

	public static void main(String[] args) {
		String cad1 = "COCO";
		System.out.println(cad1.charAt(3));
		
		
		String cad2="DAPDSK";
		System.out.println(cad2.indexOf("D"));
		System.out.println(cad2.indexOf("DAP"));
		//Sirrve para sacar un numero de una cadena version int y double, encima con espacios en blanco esto es la polla
		String cad3 = "8";
		int num = Integer.parseInt(cad3);
		System.out.println(num);
		
		String cad4 = " 6 ";
		int num2 = Integer.parseInt(cad4.trim());
		System.out.println(num2);
		
		String cad5 = "      6.8       ";
		System.out.println(Double.parseDouble(cad5.trim()));
	
		int edad1=1696;
		String str =String.valueOf(edad1);
		System.out.println("Este numero es una cadena ==> "+edad1);
		System.out.println(str.indexOf('6'));
		
		
		
	}
}
