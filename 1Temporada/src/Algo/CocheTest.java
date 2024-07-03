package Algo;

public class CocheTest {

	public static void main(String[] args) {
		Coche rojo= new Coche();
		Coche amarillo= new Coche();
		rojo.acelera(20);
		System.out.println(rojo.getVelocidad());
		amarillo.frenar(10);
		System.out.println(amarillo.getVelocidad());
		amarillo.acelera(10);
		System.out.println(amarillo.getVelocidad());
		rojo.acelera(10);
		System.out.println(rojo.toString());
		System.out.println(amarillo.toString());
	}
}
