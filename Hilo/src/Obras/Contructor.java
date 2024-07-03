package Obras;

import java.util.Random;

public class Contructor  extends Thread{
	static int getNumeroAleatorio(int desde, int hasta) {
        return (int) (desde + (Math.random() * ((hasta + 1) - desde)));
    }
	private Contenedor c;
	   
	private long tiempo;
	private int cantidad;
	public Contructor(Contenedor c){
		Random r = new Random();
		this.c=c;
		this.cantidad=r.nextInt(-10,10);
		this.tiempo=r.nextInt(0,20000);
		start();
	}

	public void run() {
		try {
			sleep(tiempo);
			
		}catch(InterruptedException e) {
			
		}
		if(cantidad>=0) {
			c.meterEscombro(Math.abs(cantidad));
		}else {
			c.sacarEscombro(Math.abs(cantidad));
		}
		
	
		
	
	}
}
