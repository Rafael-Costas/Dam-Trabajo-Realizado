package Banco;

public class TestBanco {

	public static void main(String[] args) {
		System.out.println("Sacando Dinero");
		Cuenta c = new Cuenta(40);
		
		SacarDinero s1 = new SacarDinero("Yowi", c);
		SacarDinero s2 = new SacarDinero("machuPichu", c);
		s1.start();
		s2.start();
		
		
		
		
		System.out.println("Fin main");
	}
}
