package Ejercicio2;

public class Portero extends Jugador{
	private	int golesRecibidos;
	private int penaltisParados;
	
	public Portero() {
		super();
		this.golesRecibidos=0;
		this.penaltisParados=0;
		// TODO Auto-generated constructor stub
	}

	public Portero(String n, String d, int p, int g, int a, int r,int gr, int PenaltiP) {
		super(n, d, p, g, a, r);
		// TODO Auto-generated constructor stub
		this.golesRecibidos=gr;
		this.penaltisParados=PenaltiP;
	}

	public int getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public int getPenaltisParados() {
		return penaltisParados;
	}

	public void setPenaltisParados(int penaltisParados) {
		this.penaltisParados = penaltisParados;
	}

@Override
public void imprimir() {
	// TODO Auto-generated method stub
	super.imprimir();
	System.out.println("Goles Recibidos "+ this.golesRecibidos);
	System.out.println("Penaltis Parados "+ this.penaltisParados);
}

	
}
