package Ejercicioz3;


public class Controlador {
	public static void main(String[] args) {
		Ascensor hotel= new Ascensor();
		for(int i=0; i<=29; i++) {
			Persona c= new Persona("Persona numero "+i, hotel);
		}
	}
}
