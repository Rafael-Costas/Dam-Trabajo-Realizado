package ParkingPaquete;

import Ejemplos2.Hotel;

public class Coche extends Thread{
int t=0;
	private Parking Parking;
	public Coche(String numero, Parking p) {
		// TODO Auto-generated constructor stub
		super(numero);
		this.Parking=p;
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
		Parking.entra();
		System.out.println(getName() + " Entra al Parking ");
		try {
			sleep((int) (Math.random()*20000));
		}catch(InterruptedException e) {
			
		}
		Parking.sale();
		System.out.println(getName()+ " sale del Parking");
	}

	@Override
	public String toString() {
		return "Coche [t=" + t + "]";
	}
	
}

