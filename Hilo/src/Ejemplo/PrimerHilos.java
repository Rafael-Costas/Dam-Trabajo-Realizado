package Ejemplo;

public class PrimerHilos extends Thread{
int x;
 public PrimerHilos(int x) {
	 System.out.println("Estoy creando un hilo...");
	 this.x= x;
 }
 public void run() {
	 for(int i=0; i<x; i++) {
		 System.out.println("Coso "+i);
	 }
 }
}