package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static String Romanos(int num) {
		String algo="";
		while(num!=0){
		if(num>=1000) {
			algo+="M";
			num-=1000;
		}
		
		if(num>=900 && num<1000) {
			algo+="CM";
			num-=900;
		}
		
		
		if(num>=500 && num<1000) {
			algo+="D";
			num-=500;
		}
		
		if(num>=400 && num<500) {
			algo+="CD";
			num-=400;
		}
		
		if(num>=100 && num<500) {
			algo+="C";
			num-=100;
		}
		if(num>=90 && num<100) {
			algo+="XC";
			num-=90;
		}
		if(num>=50 && num<100) {
			algo+="L";
			num-=50;
		}
		if(num>=40 && num<100) {
			algo+="XL";
			num-=40;
		}
		if(num>=10 && num<50) {
			algo+="X";
			num-=10;
		}
		if(num>=9 && num<10) {
			algo+="IX";
			num-=9;
		}
		
		if(num>=5 && num<10) {
			algo+="V";
			num-=5;
		}
		if(num>=4 && num<5) {
			algo+="IV";
			num-=4;
		}
		if(num>0 && num<5) {
			algo+="I";
			num-=1;
		}
		}
		return algo;
		
		
	}
	public static void main(String[] args) {
		/*
		 * Realiza una clase con un método decimalToRomano que transforme números en
		 * formato decimal a números en formato romano.
		 */
		
		System.out.println("Introduce un numero");
		Scanner src=new Scanner(System.in);
		int a=src.nextInt();
		System.out.println("El numero "+a+" en romano es "+Romanos(a));
	}
}
