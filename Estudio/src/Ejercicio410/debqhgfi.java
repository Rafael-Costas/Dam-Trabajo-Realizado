package Ejercicio410;

public class debqhgfi {

	public static void CalcularPrims(int num) {
		int cont=0;
		int primo=2;
		int res=0;
		boolean conf=true;
		do {
			conf=true;
			for(int i=1; i<primo; i++) {
				if(primo%i==0 && i!=1 && i!=primo) {
					conf=false;
				}
			}
		
			primo++;
			if(!conf) {
				cont++;
			}
			if(cont==num) {
				res=primo;
			}
			
		}while(cont<num);
		System.out.println("Su numero es "+res);
	}
	public static void main(String[] args) {
		CalcularPrims(4);
	}
}
