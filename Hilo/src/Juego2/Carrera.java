package Juego2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Carrera implements Runnable, Comparable<Atleta> {
ArrayList<Atleta> arr = new ArrayList<Atleta>();
Scanner src = new Scanner(System.in);
long tiempo;
//Inicializar carrera
Carrera(ArrayList<Atleta> f){
	this.arr= f;
}
Carrera(){
	
}
public int numeroParticipantes() {
	Scanner src= new Scanner(System.in);
	System.out.println("Introduce el numero de participantes: ");
	int n = src.nextInt();

	return n;
}
	public void iniciarlizarCarrera() {
		int n= numeroParticipantes();
		
		for(int i=0; i<n ; i++) {
			System.out.println("Datos del atleta: "+i);
			System.out.println("Introduzca el nombre");
			String nombre = src.nextLine();
			System.out.println("Introduzca el pais");
			String pais = src.nextLine();
			System.out.println("Introduzca el dorsal");
			int dorsal = src.nextInt();
			Atleta atleta = new Atleta(dorsal,pais,nombre);
			arr.add(atleta);
		}	
	
	}
	
	@Override
	public String toString() {
		return "Carrera [arr=" + arr + ", tiempo=" + tiempo + "]";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void Correr() {
		System.out.println("Listooos");
		Thread t=null;
		for(Atleta atleta : arr) {
		 t = 	new Thread(atleta);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	@Override
	public int compareTo(Atleta o) {
		Atleta a = (Atleta) o;
		return (int) (this.tiempo-a.segundos);
	}
	public ArrayList<Atleta> getArr() {
		return arr;
	}
	public void setArr(ArrayList<Atleta> arr) {
		this.arr = arr;
	}
	public long getTiempo() {
		return tiempo;
	}
	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}
	public void mostrarClasificados(){
		Collections.sort(this.arr);
		System.out.println("Clasificaciones");
	
	for(Atleta atleta : arr) {
		System.out.println(atleta.toString());
	}
	}
	
}
