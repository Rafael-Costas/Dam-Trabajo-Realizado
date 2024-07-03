package Ejemplos;

public class forzado {
	public static void main(String[] args) {
		int idato = 5;
		double despues;
		byte bdato;
		float chico;
		double grande = 3.1543;
		System.out.println("Mostrando valor de grande " + grande);
		// bdato = (byte) idato;
		chico = (float) grande;
		despues = chico;
		System.out.println("Mostrando valor de chico " + chico);
		System.out.println("Mostrando valor de despues " + despues);
		// System.out.println(bdato);
	}
}
