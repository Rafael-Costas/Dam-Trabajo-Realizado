package Algo;

public class cosa {

	public static boolean Gemelos(int num1, int num2) {
		int cont1=0;
		int cont2=0;
		for(int i=1; i<=num1/2; i++) {
			if(num1%i==0) {
				cont1+=i;
			}
		}
		
		for(int i=1; i<=num2/2; i++) {
			if(num2%i==0) {
				cont2+=i;
			}
		}
		
		if(cont1==num2) {
			if(cont2==num1) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	

	public static void main(String[] args) {
		/*
		 * Ejercicio 1B Dos números amigos son dos números enteros positivos a y b tales
		 * que a es la suma de los divisores de b, y b es la suma de los divisores de a.
		 * 
		 * Dados dos números A y B calcular si son números amigos. Un ejemplo es el par
		 * de números naturales (220, 284), ya que: los divisores propios de 220 son 1,
		 * 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, que suman 284; los divisores propios
		 * de 284 son 1, 2, 4, 71 y 142, que suman 220.
		 * 
		 * Listar
		 */

		System.out.println(Gemelos(220, 284));
	
		for(int i=1; i<=3000; i++) {
			for(int j=1; j<=3000; j++) {
				if(Gemelos(i, j) && i!=j) {
					System.out.println(i+" y "+j +" Son gemelos");
				}else {
					
				}
			}
		}
	}
}
