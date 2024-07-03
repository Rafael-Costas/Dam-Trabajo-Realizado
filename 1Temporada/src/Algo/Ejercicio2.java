package Algo;

public class Ejercicio2 {

	public static void main(String[] args) {
		int res1=0;
		double res2=1;
		for(int i=10; i<=90; i=i+2) {
			res1+=i;
			res2*=i;
		}
		System.out.println(res1);
		System.out.println(res2);
	}
}
