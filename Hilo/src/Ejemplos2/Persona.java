package Ejemplos2;

public class Persona extends Thread {

	private Hotel hotel;
	public Persona(String numero, Hotel p) {
		// TODO Auto-generated constructor stub
		super(numero);
		this.hotel=p;
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		try {
			sleep((int)(Math.random()*10000));
			
		}catch(InterruptedException e) {
			
		}
		hotel.entra();
		System.out.println(getName() + " Entra al hotel ");
		try {
			sleep((int) (Math.random()*20000));
		}catch(InterruptedException e) {
			
		}
		hotel.sale();
		System.out.println(getName()+ " sale del hotel");
	}
	
}

