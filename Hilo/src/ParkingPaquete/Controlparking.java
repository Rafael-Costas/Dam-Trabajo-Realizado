package ParkingPaquete;

import java.util.ArrayList;


public class Controlparking {
	public static void main(String[] args) throws InterruptedException {
	ArrayList<Coche> automoto = new ArrayList<>();	
	
	Parking hotel= new Parking(10);
	for(int i=0; i<=40; i++) {
		Coche c= new Coche("Coche numero "+i, hotel);
		automoto.add(c);
	}
	
	for(Coche coche: automoto) {
		coche.join();
		
		
	}
	System.out.println("Final");
	}
}
