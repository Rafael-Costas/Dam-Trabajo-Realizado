package Ejemplo2;
import java.awt.Color;
import java.util.ArrayList;
public class testFiguras {

	 public static void main(String[] args) {
		 int[] Posicion = {10,20};
		 double[] Lados = {50d,100d};
		 
		 Circulo MiCirculo = new Circulo(3d,Color.red,Posicion);
		 Rectangulo MiRectangulo = new	Rectangulo(Lados,Color.blue,Posicion);
		Cuadrado MiCuadrado = new Cuadrado(5.6d, Color.pink, Posicion);
		 System.out.println(MiCirculo);
		 int[] Centro = MiCirculo.getCentro();
		 System.out.println(Centro[0]);
		 System.out.println(Centro[1]);
		 Triangulo mitriangulo = new Triangulo(3, 2, Color.red, Posicion);
		 
		
		 ArrayList<Figura> lista = new ArrayList<>();
		 lista.add(MiRectangulo);
		 lista.add(MiCirculo);
		 lista.add(MiCuadrado);
		 lista.add(mitriangulo);
		 
	
		
		
		 
		 	System.out.println(MiRectangulo);
		 	System.out.println(MiCuadrado);
			System.out.println("El area del rectangulo es "+MiRectangulo.calculArea());
		 	System.out.println("El area del circulo es "+MiCirculo.calculArea());
		 	System.out.println("El area del cuadrado es "+MiCuadrado.calculArea());
		 	
		 	for(Figura f : lista) {
		 		System.out.println(f);
		 	}
	 
	 
	 }
	 
	 	 }
