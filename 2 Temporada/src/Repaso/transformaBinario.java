package Repaso;

public class transformaBinario {
	//la base sera siempre 2
	public static void transform(int dato) {
		if(2>dato) {
			System.out.print(dato);
		}else {
			 transform(dato/2);
			System.out.print(dato%2);
		}
	}
	public static void transform2(int dato) {
		if(dato<8) {
			System.out.print(dato);
		}else {
			 transform2(dato/8);
			System.out.print(dato%8);
		}
	}
	public static void main(String[] args) {
		
		transform(4096);
		System.out.println("");
		transform2(1024);
	}
}

