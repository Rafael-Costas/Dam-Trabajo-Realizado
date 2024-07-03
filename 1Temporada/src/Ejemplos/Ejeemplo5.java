package Ejemplos;

import java.util.Scanner;

public class Ejeemplo5 {
public static void main(String[] args) {
	System.out.println("Por favor introduzca el dividendo");
	Scanner src= new Scanner(System.in);
	int dividendo= src.nextInt();
	System.out.println("Introduzca divisor");
	int divisor= src.nextInt();
	int cociente=dividendo/divisor;
	int resto= dividendo%divisor;
	System.out.println("El cociente es "+cociente);
	System.out.println("El resto es "+resto);
	System.out.println("El dividendo "+dividendo+" entre "+ divisor+" da como resto "
	+resto+" y como cociente "+cociente);
}
}
