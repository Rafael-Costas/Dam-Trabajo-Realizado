import java.util.InputMismatchException;

public class EjemploIfTernario {

	public static void main(String[] args) {
		int num=0;
		boolean Seguir=false;
		do {
			try {
			CapturaDatos a= new CapturaDatos();
			num = a.capturarEntero();
			
			Seguir=false;
		}catch(InputMismatchException e) {
			System.out.println("Cagaste");
			Seguir=true;
		}}while(Seguir);
					System.out.println(num);
					CapturaDatos a= new CapturaDatos();
					System.out.println(a.esPar(num));
	}
	
	

}