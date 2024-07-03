package Ejemplos;

public class KLogicos8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=2, n=5;
		boolean res;
		res = m > n && m >=n;
		
		System.out.println("El valor de res es : "+res);
	
		res= !(m> n || m== n);
		System.out.println("El valor de res es " +res);
	}

}
