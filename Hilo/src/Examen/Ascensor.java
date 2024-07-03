package Examen;

public class Ascensor {
	private int peso;
	private int capacidadMaxima;
	public Ascensor( ) {
		this.peso=0;
		
		this.capacidadMaxima=0;
	}
	
	public synchronized void sube_persona(int Ppeso) {
		while(capacidadMaxima>6 && peso+Ppeso>450) {
			try {
				System.out.println("Esperando, No puedes subir al ascensor");
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		capacidadMaxima++;
		peso+=Ppeso;
	}
	
	public synchronized void baja_persona(int Ppeso) {
		System.out.println("Persona sale, peso y hueco aligerados");
		capacidadMaxima--;
		peso-=Ppeso;
		notifyAll();
		
	}
}
