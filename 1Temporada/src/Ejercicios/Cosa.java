package Ejercicios;

import java.util.Scanner;

public class Cosa {


	public static int calculaLukiNamber(int num) {

		int total = 0;
		int temp = num;
		
		while (temp != 0 ) { // 2032
			total += (temp % 10); // 5  203    3   20    0   2      
			//System.out.println("temp%10 resto" + temp % 10);   //resto 
			temp = temp / 10; // 153    //cociente
			//System.out.println("temp/10 cociente " +temp);
			//System.out.println("total de momento: "+total);
		
		
		
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
	int ln=calculaLukiNamber(suma);
	while(ln>=10) {
		ln=calculaLukiNamber(ln);
	}
	System.out.println("tu Lucky Numero es: "+ ln);
}

}
