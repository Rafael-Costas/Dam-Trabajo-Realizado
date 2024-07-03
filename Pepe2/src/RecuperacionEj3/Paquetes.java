package RecuperacionEj3;

import java.util.Random;



public class Paquetes extends Thread {

	int peso;
	Elevador elevador;
	Random r = new Random();
	public Paquetes(String num, Elevador as) {
		super(num);
		this.peso=r.nextInt(25,45);
		this.elevador=as;
		start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			sleep((int)(Math.random()*10000));
			
		}catch(InterruptedException e) {
			
		}
		elevador.carga_paquete(this.peso);
		System.out.println(getName() + " Entra al ascensor ");
		try {
			sleep((int) (Math.random()*20000));
		}catch(InterruptedException e) {
			
		}
		elevador.descarga_paquete(this.peso);
		System.out.println(getName()+ " sale del ascensor");
	}
	}

