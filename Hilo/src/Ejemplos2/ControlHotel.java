package Ejemplos2;

public class ControlHotel {
public static void main(String[] args) {
	Hotel hotel= new Hotel(30);
	for(int i=0; i<=50; i++) {
		Persona c= new Persona("Cliente numero "+i, hotel);
	}
}
}
