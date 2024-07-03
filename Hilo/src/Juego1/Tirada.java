package Juego1;

public class Tirada extends Thread implements Comparable<Tirada>{

	String nombre;
	int puntos;
	
	Tirada(String n){
		this.nombre=n;
	}
	public void run() {
		Dado d;
		for(int i=0; i<8; i++) {
		 d = new Dado();
		d.start();
		//System.out.println(d.toString());
	
		
		try {
			d.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		puntos+=d.getDado();
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Tirada [nombre=" + nombre + ", puntos=" + puntos + "]";
	}
	
	@Override
	public int compareTo(Tirada o) {
		Tirada t = (Tirada)o;
		/*if(this.puntos>t.puntos) {
			return this.puntos-t.puntos;
		}else if(this.puntos<t.puntos){
			return this.puntos - t.puntos;
		}else {
			return 0;
		}*/
		return -(this.puntos-t.puntos);
	}
	
	

	/*@Override
	public int compareTo(Object o) {
		Tirada t = (Tirada)o;
		/*if(this.puntos>t.puntos) {
			return this.puntos-t.puntos;
		}else if(this.puntos<t.puntos){
			return this.puntos - t.puntos;
		}else {
			return 0;
		}
		return this.puntos-t.puntos;
	}*/
	
}
