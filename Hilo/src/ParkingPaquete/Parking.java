package ParkingPaquete;

public class Parking {


	private int places;
	int t=0;
	public Parking(int places) {
		if(places<0) {
			places=0;
		}
		this.places=places;;
	}
	
	public synchronized void entra() {
		while(places==0) {
			try {
				System.out.println("Esperando, parking Completo");
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		places--;
	}
	
	public synchronized void sale() {
		System.out.println("Coche SALE: plaza liberada");
		places++;
		notify();
		if(places==0) {
			
		}
	}
}

