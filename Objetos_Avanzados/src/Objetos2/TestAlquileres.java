package Objetos2;

import java.util.ArrayList;

public class TestAlquileres {

	public static void main(String[] args) {
		
		
		
		Deportivo deportivo = new Deportivo("1234 MNL", "SEAT", "600E", "beige", 0.5, 850);
		Furgoneta furgoneta = new Furgoneta("3445 BNT", "citroen", "c15", "indefinido", 500.0, 1000, 150);
		Turismo turismo = new Turismo("2345 JVM", "SEAT", "León", "Negro", 80.0, 3, false);
		Vehiculo veh = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
		
		ArrayList<Vehiculo> misAlquileres = new ArrayList<Vehiculo>();
		
		/*//añado vehiculos a la lista
		misAlquileres.add(veh);
		misAlquileres.add(deportivo);
		misAlquileres.add(furgoneta);
		misAlquileres.add(turismo);
	
		for (Vehiculo vehiculo : misAlquileres) {
			System.out.println(vehiculo);
			
		}
		for (Vehiculo vehiculo : misAlquileres) {
			
			vehiculo.Arrancar();
		}

		Vehiculo miVehiculo = new Turismo("2090 tur", "skoda", "Fabia", "Negro", 90.0, 2, true);
		System.out.println("INFO "+ miVehiculo.toString());

		Vehiculo miVeh2 = new Furgoneta("4080 FUR", "FIAT DUcato", "negro", "Indefinido", 80.0,  850, 8);
		System.out.println("INFO "+ miVeh2.toString());
		Vehiculo miVeh3 = new Deportivo("3122 cdecww", "Banana", "600E", "dwqd", 150.0, 850);
		System.out.println("INFO "+ miVeh3.toString());
		*/
		Vehiculo miVehiculo = new Turismo("4090 TUR", "skoda", "fabia", "negro",90.0, 2 , true);
		Turismo miNuevoTurismo= (Turismo) miVehiculo;
		System.out.println("Hola");
		if (miNuevoTurismo instanceof Turismo) {
			System.out.println("HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		}
		//No FUnciona los metodos de abajo debido a que no puedes transformar un turismo a un deportivo
		
		Deportivo miNuevoDeportivo = (Deportivo) miVehiculo;
		
	}
	

}
