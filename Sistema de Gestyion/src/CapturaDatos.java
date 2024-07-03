import java.util.Scanner;

public class CapturaDatos {

	Scanner src;
	public CapturaDatos() {
		src= new Scanner(System.in);
	}
	
	public int capturarEntero() {
		System.out.println("Introduzca un entero");
	int entero = src.nextInt();
	return entero;
	}
	
	public static boolean esPar(int entero) {
		return entero%2==0?true:false;
	}
	
}
