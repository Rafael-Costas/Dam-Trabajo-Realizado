package Ejercicio4_2;

public abstract class  Local extends Inmuebles{

	protected Local(int i, int a, String d, double p, tipo tipolocal) {
		super(i, a, d);
		// TODO Auto-generated constructor stub
		this.tipoLocal=tipolocal;
	}
	enum tipo{INTERNO,CALLE};
	protected tipo tipoLocal;
	

	
}
