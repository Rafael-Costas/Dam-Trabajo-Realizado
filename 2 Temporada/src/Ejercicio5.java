import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las
		 * mayúsculas). Después, ve pidiendo posiciones del array por teclado y si la
		 * posicion es correcta, se añadira a una cadena que se mostrara al final, se
		 * dejará de insertar cuando se introduzca un -1.
		 * 
		 */
		char [] Bannana={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ',
                'O','P','Q','R','S','T','V','U','W','X','Y','Z'};
	
		Scanner src= new Scanner(System.in);
		String Palabra= "";
		int num=0;
		System.out.println("introduzaca un número por letra");
		System.out.println("Introduzca -1 para salir");
		do {
			num= src.nextInt();
			if(num>=0 && num <27) {
			Palabra+=Bannana[num];
			}
			if(num>26 || num<-1) {
				System.out.println("Número equivocado buen señor");
			}
			if(num==-1) {
				System.out.println("Has salido");
			}
			
		}while(num!=-1);
		System.out.println(Palabra);
	}
}
