package prouno;

public class LanzadorProceso {
	public void ejecutar(String ruta){

		ProcessBuilder pb;
		try {
		pb = new ProcessBuilder(ruta);
		pb.start();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
		public static void main(String[] args) {
		String ruta="C:\\Program Files\\Adobe\\Acrobat DC\\Acrobat\\Acrobat.exe";
		LanzadorProceso lp=new LanzadorProceso();
		lp.ejecutar(ruta);
		System.out.println("Finalizado");
		}
	}
