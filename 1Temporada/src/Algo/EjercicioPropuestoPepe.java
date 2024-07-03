package Algo;

public class EjercicioPropuestoPepe {

	public static int getNumeros() {
	 int num=(int) (Math.random()*49+1);
	return num;	
	}
	
	public static int getNumeros2() {
		 int num=(int) (1+(Math.random()*(49+1)-1));
		return num;	
		}
	
	public static int algo() {
		int num= (int) (127+Math.random()*((318+1)-127));
		return num;
	}
	public static int algo2() {
		int num= (int) (Math.random()*193+127);
		return num;
	}
	
	public static void main(String[] args) {
		System.out.print(getNumeros()+" ");
		System.out.print(getNumeros()+" ");
		System.out.print(getNumeros()+" ");
		System.out.print(getNumeros()+" ");
		System.out.print(getNumeros()+" ");
		System.out.println(getNumeros()+" ");
		
	
		for(int i=0; i<1000; i++) {
		int num=	algo2();
			if(num==127 || num==319) {
			System.out.print(num + " ");
			}
			
		}
	}
}
