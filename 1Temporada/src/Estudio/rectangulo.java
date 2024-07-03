package Estudio;

public class rectangulo implements Cloneable {

	private String nombre;
	private int ancho = 0;
	private int alto = 0;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return  super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	rectangulo(int an, int al, String nombre) {
		ancho = an;
		this.alto = al;
		this.nombre=nombre;
	}

	public int getAncho() {
		return this.ancho;
	}

	public int getAlto() {
		return this.alto;
	}

	public rectangulo incrementaAncho() {
		ancho++;
		return this;
	}

	public rectangulo incrementarAlto() {
		alto++;
		return this;
	}

	rectangulo(rectangulo r){
		this.ancho=r.ancho;
		this.alto=r.alto;
		this.nombre=r.nombre;
	}
	public void setName(String Algo) {
		this.nombre=Algo;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String getNombre() {
		return this.nombre;
	}
	rectangulo(){
		this.alto=214748368;
	}
	@Override
	public String toString() {
		return "rectangulo [ancho=" + ancho + ", alto=" + alto +"nombre"+ nombre + "]";
	}

	@Override
	public boolean equals (Object obj) {
		if(obj instanceof rectangulo) {
			rectangulo tempRectangulo= (rectangulo) obj;
			if(this.alto==(tempRectangulo.alto) && this.ancho==(tempRectangulo.ancho) &&this.nombre.equals(tempRectangulo.nombre)) {
			return true;	
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		rectangulo r1 = new rectangulo(8, 10, "Banana");

		System.out.println(r1.getAlto());
		System.out.println(r1.getAncho());
		r1.incrementaAncho();
		r1.incrementarAlto();
		System.out.println(r1.getAlto());
		System.out.println(r1.getAncho());
		System.out.println(r1.toString());

		rectangulo otro = null;
		otro = r1;
		System.out.println(otro.toString());
		r1.incrementaAncho();
		System.out.println("otro " + otro.toString());
		System.out.println("r1" + r1.toString());
		System.out.println(r1);
		System.out.println(otro);

		System.out.println("Son r1 y el rectangulos otro el mismo objeto ????");
		System.out.println(r1.equals(otro));
		System.out.println(r1.hashCode());
		System.out.println(otro.hashCode());

		try {
			Object clo= r1.clone(); 
			System.out.println("clo "+clo.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		otro=(rectangulo) r1.clone();
		
		
		
		
	
	}
}

