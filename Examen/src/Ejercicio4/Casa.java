package Ejercicio4;


public class Casa extends vivienda {
	 protected Casa(int i, int a, String d,  int habitacione, int baños, int pisos) {
			super(i, a, d,  habitacione, baños);
			this.numPisos=pisos;
			// TODO Auto-generated constructor stub
		}

	protected int numPisos;
	}
