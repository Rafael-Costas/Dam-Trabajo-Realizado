package Ejemplos;

public class EjercicioPepe {
	public static int getNumeros2() {
		 int num=(int) (1+(Math.random()*(99+1)-1));
		return num;	
		}
	public static void main(String[] args) {
		int par=0;
		int num=0;
		for(int i=0; i<40; i++) {
		num=getNumeros2();
			if(num%2==0) {
			par++;
		}
			System.out.println(num);
		
			
		}
	System.out.println("Hay "+par+ " pares");
	}
}
