package Estudio;

public class testEquals {

	public static void main(String[] args) {
		rectangulo r1= new rectangulo(5,7,"hola");
		rectangulo r2= new rectangulo(5,7,"hola");
		rectangulo r3= r1;
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
	}
}
