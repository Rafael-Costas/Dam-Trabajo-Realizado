package Algo;

public class Coche {
	private  int velocidad;
	Coche(){
		this.velocidad=0;
	}
	public  int getVelocidad() {
		return this.velocidad;
	}
	public  void acelera(int acel) {
		velocidad+= acel;
	}
	public  void frenar(int fren) {
		velocidad-=fren;
	}
	
	
	public String toString() {
		return "Coche [velocidad=" + velocidad + "]";
	}
	public static void main(String[] args) {
		Coche rojo= new Coche();
		Coche amarillo= new Coche();
		rojo.acelera(20);
		System.out.println(rojo.getVelocidad());
		amarillo.frenar(10);
		System.out.println(amarillo.getVelocidad());
		amarillo.acelera(10);
		System.out.println(amarillo.getVelocidad());
		rojo.acelera(10);
	}
}
