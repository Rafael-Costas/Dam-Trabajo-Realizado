package Ejemplo;

public class SegundoHilo extends Thread{

	int c;
	int hilo;
	public SegundoHilo(int hilo) {
	this.hilo= hilo;
	System.out.println("Creando Hilo");
	c++;
	}
	public void run() {
		c=0; 
		while(c<=5) {
		System.out.println("Hilo "+hilo+" contador "+c);
		c++;
		}
	}
}
