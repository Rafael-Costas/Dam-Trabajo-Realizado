package Examen;

public class testLibro {

	public static void main(String[] args) {
		
		Libro Ad=new Libro("Adeline", "Marta", 7, 1);
		
		Libro C=new Libro();
		
		Libro B=new Libro();
		
		System.out.println(B.toString());
		
		B.setAutor("MArco");
		B.setTitulo("Viaje");
		
		System.out.println(B.getAutor());
		System.out.println(B.getTitulo());
		
		System.out.println(C.toString());
		
		C.setNumEjem(7);
		C.setPrestado(2);
		
		System.out.println(C.getNumEjem());
		System.out.println(C.getPrestado());
		
		
		System.out.println(Ad.toString());
		System.out.println(Ad.prestamo());
		System.out.println(Ad.toString());
		Ad.setPrestado(0);
		System.out.println(Ad.devolucion());
		System.out.println(Ad.toString());
		
	}
}
