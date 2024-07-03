package Ejemplo;

public class TesteoSegundoHilo {
	public static void main(String[] args) {

		SegundoHilo hilo=null;;
		for (int i = 0; i < 20; i++) {
				hilo= new SegundoHilo(i);
				hilo.start();
		}
	}
}
