
public class Fallo {

	public static void bobo() throws Miexcepcion {
		int num=0;
		try {
			num=2/0;
			System.out.println(num);
		}catch(ArithmeticException a) {
			throw new Miexcepcion("BOBOOOOOOOOOOOOOOO");
		}
		
		
		
	}
	public static void main(String[] args) throws Miexcepcion {
		
		bobo();
	}
}
