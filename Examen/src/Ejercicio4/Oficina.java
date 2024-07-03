package Ejercicio4;


public class Oficina extends Local implements impuestos{
public Oficina(int i, int a, String d, double p, boolean e,tipo2 calle) {
	super(i, a, d, p,calle);
	this.esGobierno=e;
	// TODO Auto-generated constructor stub

}

protected double valorArea=3875;
protected boolean esGobierno;

@Override
protected double calculaPrecio(double valorArea) {
	// TODO Auto-generated method stub
	
	return this.valorArea* this.area;
}

@Override
public String toString() {
	return "Oficina [valorArea=" + valorArea + ", esGobierno=" + esGobierno + "]";
}
@Override
public double calcularImpuestos() {
	double res = (calculaPrecio(1)*104)/100;
	if(this.esGobierno) {
	res+=4000;
	}
	return res;
}


}