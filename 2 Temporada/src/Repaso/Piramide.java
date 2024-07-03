package Repaso;

import java.util.Scanner;

public class Piramide {

	public static int Elemento(int fila, int columna) {
		if(fila<1 || columna <1 )return 0;
		if(columna ==1)return 1;
		return Elemento(fila-1, columna)+Elemento(fila-1, columna-1);
	}
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
	System.out.println("introduce el numero");
	int num=src.nextInt();
	for(int i=1; i<(num+1); i++) {
		for(int e=0; e<(num -i); e++) {
			System.out.print(" ");}
			for(int j=1; j<(num+1); j++) {
				int dato =Elemento(i,j);
			
				
				if(dato>0&&dato<10) {
					System.out.print(" "+dato+" ");
					
				}
				
				if(dato>9) {
					System.out.print(dato+"");
				}
			}
			System.out.println("");
		
	}
		
	src.close();
	}
}
