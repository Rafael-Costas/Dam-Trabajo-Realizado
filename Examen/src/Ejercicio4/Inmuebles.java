package Ejercicio4;
public abstract class Inmuebles implements impuestos {

	protected int id;
	protected int area;
	protected String direccion;
	
	
	protected Inmuebles(int id, int area, String direccion) {
		this.id=id;
		this.area=area;
		this.direccion=direccion;
		
		
	}
	
	protected  double calculaPrecio(double Precioventa) {
		
		return Precioventa*area;
	}
	@Override
	public String toString() {
		return "Inmuebles [id=" + id + ", area=" + area + ", direccion=" + direccion +  "]";
	}
	
}
