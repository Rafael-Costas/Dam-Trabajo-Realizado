package RecuperacionEj3;

import java.util.Random;

public class Elevador {

	int capacidad;
	int peso;
	Random r = new Random();
	public Elevador(){
		this.capacidad=3;
		this.peso=100;
	}

	public synchronized void carga_paquete(int peso) {
		while(capacidad<=0 && (this.peso-peso)<0 ) {
		System.out.println("No puede entrar");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		this.capacidad--;
		this.peso-=peso;
			
	}
	public synchronized void descarga_paquete(int peso) {
		

		this.capacidad++;
		this.peso+=peso;
		notifyAll();
	}
	}
