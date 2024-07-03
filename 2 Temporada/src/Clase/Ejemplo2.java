package Clase;

public class Ejemplo2 {
	public static void mostrar(byte[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		byte [] temperaturas1 = {10,11,12,11,10,9,18,19,14,13,15,15};
		System.out.println("Numero de valores: "+temperaturas1.length);
		
		byte[] temperaturas2 = temperaturas1.clone();
		byte [] temperaturas3 = temperaturas1;
		
		System.out.println("Temperaturas 1");
		mostrar(temperaturas1);
		
		System.out.println("Temperaturas 2");
		mostrar(temperaturas2);
		
	
		System.out.println("Temperaturas 3");
		mostrar(temperaturas3);
		
		
		System.out.println("Temperaturas 1:");
		System.out.println(temperaturas1);
		System.out.println("Temperaturas 2:");
		System.out.println(temperaturas2);
		System.out.println("Temperaturas 3:");
		System.out.println(temperaturas3);
		
		
		if(temperaturas1.equals(temperaturas2)) {
			System.out.println("1 y  2 son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		if(temperaturas1.equals(temperaturas3)) {
			System.out.println("1 y  3 son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		
		temperaturas1[0]=32;
		
		mostrar(temperaturas3);
		
		
	}
}
