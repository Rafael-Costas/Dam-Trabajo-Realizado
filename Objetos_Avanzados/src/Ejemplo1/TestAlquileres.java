package Ejemplo1;

public class TestAlquileres {

	public static void main(String[] args) {
	Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
	Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "SEAT", "León", "negro", 80.0);
	
	Cliente cliente1 = new Cliente ("30435624X", "Juan", "Pérez");
	
	VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1, vehiculo1, 11, 11, 2011, 2);
	System.out.println("Vehiculo alquilado");
	System.out.println("Cliente : ");
	System.out.println(alquiler1.getCliente().getNif());
	System.out.println(alquiler1.getCliente().getNombre());
	System.out.println(alquiler1.getCliente().getApellidos());
	System.out.println("Vehiculo: "+ alquiler1.getVehiculo().getMatricula());
	System.out.println("Se lo llevo por "+alquiler1.getTotalDiasAlquiler()+" dias");
	}
}
