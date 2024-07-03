package Ejemplo;

public class TesteoPrimerHilo {

	public static void main(String[] args) {
		PrimerHilos abc = new PrimerHilos(10);
		System.out.println("Antes de arrancar el hilo");
		PrimerHilos hilo = new PrimerHilos(400);
		abc.start();
		hilo.start();
		System.out.println("EL main a terminado");
	
		
	}
}
