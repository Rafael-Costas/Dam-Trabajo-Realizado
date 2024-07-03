package Algo;

public class Caja {
int anchura =0;
int altura=0;
int profundidad=0;

	Caja(){
		
	}
	Caja(int a, int alt, int Pro){
		if(a<0) {
			a=0;
		}
		if(alt<0) {
			alt=0;
		}
		if(Pro<0) {
			Pro=0;
		}
		this.anchura=a;
		this.altura=alt;
		this.profundidad=Pro;
	}
	public int getAnchura() {
		return anchura;
	}
	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}
	public int Volumen() {
		return this.altura*this.anchura*this.profundidad;
	}
	
	
	@Override
	public String toString() {
		return "Caja [anchura=" + anchura + ", altura=" + altura + ", profundidad=" + profundidad + "]";
	}
	public static void main(String[] args) {
		Caja Antonio= new Caja();
		Caja Madera = new Caja(2, 2, 2);
		
	System.out.println(	Antonio.toString());

	System.out.println(Madera.toString());
	System.out.println(Madera.Volumen());
		
	}
}
