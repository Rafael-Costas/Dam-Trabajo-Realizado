package Juego2;

import java.util.Random;

public class Atleta implements Runnable, Comparable<Atleta>{
	int dorsal;
	String nombre;
	long segundos;
	String pais;
	
	Atleta(int d, String n, long s, String p){
		this.nombre=n;
		this.dorsal=d;
		this.pais=p;
		this.segundos=s;
	}
	Atleta(int d, String n,  String p){
		this.nombre=n;
		this.dorsal=d;
		this.pais=p;
		
	}
	Atleta(){
		
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getSegundos() {
		return segundos;
	}
	public void setSegundos(long segundos) {
		this.segundos = segundos;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public void run() {
	System.out.println(this.nombre+ " preaparado ");
		long inicio=System.currentTimeMillis();
			Random r = new Random();
			segundos=r.nextLong(800, 1200);
			try {
			Thread.sleep(segundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(this.nombre+ " ha llegago");
		long fin= (segundos);
		this.segundos=fin;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Atleta [dorsal=" + dorsal + ", nombre=" + nombre + ", segundos=" + segundos + ", pais=" + pais
				+ "]";
	}
	@Override
	public int compareTo(Atleta o) {
		Atleta a = (Atleta) o;
		return (int) (this.segundos-a.segundos);
	}
	

}
