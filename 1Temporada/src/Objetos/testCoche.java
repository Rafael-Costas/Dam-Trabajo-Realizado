package Objetos;

public class testCoche  {

	public static void main(String[] args) {
		
	
		Coche Banana= new Coche(4, "marron", 70, "Amarillo", "FEO", "Yoquese", 1, -1);
		Coche Manzana= new Coche(5);
		Coche Manazana= new Coche();
Manzana= new Coche();
		Banana.Acelerar();
		Banana.frenar();
		Banana.pasarItv();
		Banana.arrancar();
		Manzana.frenar();
		Manzana.CambiarCocor("Rojo");
		System.out.println(Banana.color);
		System.out.println(Manzana.color);
		System.out.println(Banana.toString());
		System.out.println(Manzana.toString());
		System.out.println(Manzana.equals(Banana));
		Manzana.color="ROJO COMO TU CARA";
		System.out.println(Manzana.color);
		Manzana.Acelerar(300);
	
	}
	
}
