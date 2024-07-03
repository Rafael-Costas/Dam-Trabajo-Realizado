package Ejemplos2;

public class Hotel {

	private int places;
	public Hotel(int places) {
		if(places<0) {
			places=0;
		}
		this.places=places;;
	}
	
	public synchronized void entra() {
		while(places==0) {
			try {
				System.out.println("Esperando, hotel Completo");
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		places--;
	}
	
	public synchronized void sale() {
		System.out.println("Cliente SALE: Cama liberada");
		places++;
		notify();
		if(places==0) {
			
		}
	}
}
