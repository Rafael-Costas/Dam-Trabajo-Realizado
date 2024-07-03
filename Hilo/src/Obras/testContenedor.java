package Obras;

import java.util.ArrayList;

import ParkingPaquete.Coche;

public class testContenedor {

	public static void main(String[] args) {
		Contenedor contenedor = new Contenedor(0);
		ArrayList<Contructor> automoto = new ArrayList<>();	
		for(int i=0; i<50; i++) {
			Contructor contructor= new  Contructor(contenedor);
			automoto.add(contructor);
		}
		
		for (Contructor contructor : automoto) {
			try {
				contructor.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Se ha acabó la obra");
	}
}
