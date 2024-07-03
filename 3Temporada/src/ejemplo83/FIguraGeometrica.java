package ejemplo83;

public class FIguraGeometrica {

	private double volumen;
	private double superficie;
	
	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "FIguraGeometrica [volumen=" + volumen + ", superficie=" + superficie + "]";
	}
	

}
