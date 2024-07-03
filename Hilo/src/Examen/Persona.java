package Examen;

import ParkingPaquete.Parking;

public class Persona extends Thread {

	/*public Persona(String numero, Ascensor a) {
		// TODO Auto-generated constructor stub
		super(numero);
		this.Parking=p;
		start();
	}*/
	int t=0;
	private Ascensor ascensor;
	int peso;
	public Persona(String numero, Ascensor a, int Ppeso ) {
		// TODO Auto-generated constructor stub
		super(numero);
		this.ascensor=a;
		this.peso=Ppeso;
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		try {
			this.t=((int)(Math.random()*10000));
			sleep(t);
			
		}catch(InterruptedException e) {
			
		}
		ascensor.sube_persona(this.peso);
		System.out.println(getName() + " Entra al Ascensor ");
		try {
			sleep((int) (Math.random()*20000));
		}catch(InterruptedException e) {
			
		}
		ascensor.baja_persona(peso);
		System.out.println(getName()+ " sale del Ascensor");
	}

	@Override
	public String toString() {
		return "Persona [t=" + t + ", ascensor=" + ascensor + ", peso=" + peso + "]";
	}

	
	
}

