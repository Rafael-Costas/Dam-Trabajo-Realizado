package Obras;

import javax.sql.rowset.spi.SyncFactory;

public class Contenedor {
	private final int CAPACIDAD;
	private int escombros;
	public Contenedor(int escombros) {
		
		this.CAPACIDAD = 0;
		this.escombros=escombros;
	}
	public synchronized void meterEscombro(int cantidad) {
		if(cantidad + this.escombros<CAPACIDAD) {
			escombros+=cantidad;
			System.out.println("Escombros introducidos");
		
	}else {
		try {
			System.out.println("Todavía no se puede introducir los escombros");
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	public synchronized void sacarEscombro(int cantidad) {
		if(escombros-cantidad<0) {
			System.out.println("Escombros sacados");
		escombros-=cantidad;	
		notifyAll();
		}else {
			System.out.println("No se pueden sacar escombros");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
