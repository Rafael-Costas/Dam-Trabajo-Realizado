
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
	
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i]+" ");
		}
		int a=0;
		System.out.println();
		System.out.println(a++);
		System.out.println(++a);
	
		for (String  j:args) {
			System.out.println(j);
		}
	
	try {
		int k=0;
		do {
			k=k/0;
			System.out.println(args[k]);
			k++;
		}while(k<args.length);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("No se muestra nada, porque no hay nada");
	}
	catch(ArithmeticException e1) {
		System.out.println("mongolo entras en una paradoja infinita");
	}
	
	int res=0;
	
		
			for(int i=0; i<args.length; i++) {
		try {
				if ((args[i] instanceof String) ) {
					res += Integer.parseInt(args[i]);
				}
			
		}catch (NumberFormatException e) {
			System.out.println(args[i]+" No es un numero");
		}
	}
	

	System.out.println("EL total de la suma es "+res);
	}

}
