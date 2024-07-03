package Estudio;

public class testMetodo {

	public int dato=0;
		public static int datostatico=0;
		public static void metodostatico() {
			//this.datostacio++; no puedes usar this debido a que es estatico
			datostatico++;
			
			
		}
		public void metodo() {
			dato++;
			datostatico++;
		}
		public static void main(String[] args) {
		datostatico++;
			metodostatico();
			
			testMetodo a= new testMetodo();
			
			
		}
}
