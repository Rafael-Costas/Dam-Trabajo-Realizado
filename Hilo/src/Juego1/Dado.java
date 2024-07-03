package Juego1;

import java.util.Random;

public class Dado extends Thread{
	int dado=0;
	int res=0;
		Random r = new Random();
	Dado(){
		this.dado=r.nextInt(6)+1;
		
	}
	public void run(){
		System.out.println("En el dado salio "+this.dado);
	}
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	
	
}
