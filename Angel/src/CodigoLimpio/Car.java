package CodigoLimpio;

abstract public class Car {
	
	String registration;
	String model;
	String brand;
	
	// tipo de vehiculo. Matricula antigua y moderna
	
	
	
}
class NewCar extends Car{
	 boolean valideateRegistration() {
		 return registration.length()==7;
	 }
}
class OldCar extends Car{
	 boolean valideateRegistration() {
		 return registration.length()==8;
	 }
}
