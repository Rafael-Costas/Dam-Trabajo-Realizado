package Ejercicioz3;

import java.util.Random;

public class Ascensor {
int capacidad;
int peso;
Random r = new Random();
public Ascensor(){
	this.capacidad=6;
	this.peso=450;
}

public synchronized void entra(int peso) {
	while(capacidad<=0 && (this.peso-peso)<0 ) {
	System.out.println("No puede entrar");
	try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	this.capacidad--;
	this.peso-=peso;
		
}
public synchronized void sale(int peso) {
	

	this.capacidad++;
	this.peso+=peso;
	notifyAll();
}
}
