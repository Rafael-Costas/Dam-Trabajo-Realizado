package Ejercicios;

import java.util.Scanner;

public class Propuesto5 {


	public static int sumaCompleta(int n) {
		
		int resultado=calculaLukiNamber(n);
		
		if(resultado<10)
			return resultado;
		else
			return calculaLukiNamber(resultado);	
		//si son dos volver a calcular 
	}
	
	public static int calculaLukiNamber(int num) {

		int total = 0;
		int temp = num;
		while (temp != 0 || total<10 ) { // 2032
			total += (temp % 10); // 5  203    3   20    0   2      
			//System.out.println("temp%10 resto" + temp % 10);   //resto 
			temp = temp / 10; // 153    //cociente
			//System.out.println("temp/10 cociente " +temp);
			//System.out.println("total de momento: "+total);
		}
		if(temp>=10) {
			return temp;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int dia,mes,ano;
		int suma=0;
		
		System.out.println("dia: ");
		dia=sc.nextInt();
		System.out.println("mes: ");
		mes=sc.nextInt();
		System.out.println("ano: ");
		ano=sc.nextInt();
		
		//primera suma  28 6 2001  ->>>>> 2035  >>>>>  10
		suma=dia+mes+ano;

		//mientras no quede en una cifra el ln seguir sumando los numeros
		int ln=sumaCompleta(suma);
		
		System.out.println("tu Lucky Numero es: "+ ln);
	}
	
}