package Ejercicio4;



public abstract class  Local extends Inmuebles {

	protected Local(int i, int a, String d, double p, tipo2 tipolocal) {
		super(i, a, d);
		// TODO Auto-generated constructor stub
		this.tipoLocal=tipolocal;
	}
	enum tipo2{INTERNO,CALLE};
	protected tipo2 tipoLocal;
	
	
	
}

