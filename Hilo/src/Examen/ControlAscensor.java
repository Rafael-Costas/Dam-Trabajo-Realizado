package Examen;

import java.util.ArrayList;
import java.util.Random;

import ParkingPaquete.Coche;
import ParkingPaquete.Parking;

public class ControlAscensor {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Persona> personitas = new ArrayList<>();	
		Random r = new Random();
		Ascensor ascensor= new Ascensor();
		for(int i=0; i<=30; i++) {
			Persona p= new Persona("Persona numero "+i, ascensor, r.nextInt(50,100));
			personitas.add(p);
		}
		
		for(Persona persona: personitas) {
			persona.join();
			
			
		}
		System.out.println("Final");
		}


}
