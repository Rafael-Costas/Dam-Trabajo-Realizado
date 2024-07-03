package Objetos;

public class Pajaro2 {

	// *** atributos o propiedades ****
	private static int numpajaros = 0;
	private char color; // propiedad o atributo color
	private int edad; // propiedad o atributo edad
	// *** métodos de la clase ****

	static void nuevopajaro() {
		numpajaros++;
	};

	Pajaro2() {
		color = 'v';
		edad = 0;
		nuevopajaro();
	}

	Pajaro2(char c, int e) {
		color = 'c';
		edad = e;
		nuevopajaro();
	}
//No necesita ayuda
	static void muestrapajaros() {
		System.out.println(numpajaros);
	};

	public static void main(String[] args) {
		Pajaro2 pl, p2;
		pl = new Pajaro2();
		
		pl.muestrapajaros();
		
		p2 = new Pajaro2('a', 3);
		
		p2.muestrapajaros();
		muestrapajaros();
	
	}

	@Override
	public String toString() {
		return "Pajaro2 [color=" + color + ", edad=" + edad + "]";
	}
}
