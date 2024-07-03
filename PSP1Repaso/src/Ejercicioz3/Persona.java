package Ejercicioz3;

import java.util.Random;

public class Persona extends Thread {
int peso;
Ascensor ascensor;
Random r = new Random();
public Persona(String num, Ascensor as) {
	super(num);
	this.peso=r.nextInt(60,100);
	this.ascensor=as;
	start();
}
@Override
public void run() {
	// TODO Auto-generated method stub

	try {
		sleep((int)(Math.random()*10000));
		
	}catch(InterruptedException e) {
		
	}
	ascensor.entra(this.peso);
	System.out.println(getName() + " Entra al ascensor ");
	try {
		sleep((int) (Math.random()*20000));
	}catch(InterruptedException e) {
		
	}
	ascensor.sale(this.peso);
	System.out.println(getName()+ " sale del ascensor");
}
}
