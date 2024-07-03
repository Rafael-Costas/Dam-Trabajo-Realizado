package Ejemplo;

public class TestSegundoHilo2 {

	public static void main(String[] args)  {

		SegundoHilo hilo=null;;
		for (int i = 0; i < 20; i++) {
				hilo= new SegundoHilo(i);
				hilo.start();
				try {
					hilo.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println("Han rematado todos los hilos joineados");
		System.out.println("El main ha terminado");
	}
		
	
	
}

