package EjerciciosParaEntretenerme;

import java.util.Scanner;

public class Letras {

	
		private char letra;
		Letras(char i){
		letra = i;
		if (i >= 'a');
		letra -= 'a';
		letra += 'A';
		}
		
		public char getLetra() {return letra;}
		public void printLetra() {
		System.out.println (letra) ;
		}

		@Override
		public String toString() {
			return "Letras [letra=" + letra + "]";
		}
		public static void main(String[] args) {
			Scanner src= new Scanner(System.in);
			System.out.println("introduce un char");
			char b= src.next().charAt(0);
			Letras a= new Letras(b);
			System.out.println(a.toString());
		}
	}

