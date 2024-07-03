package algo;

public class Lanzador {

	public void ejecutar(String ruta){
//Solo sirve con aplicaciones 
		ProcessBuilder pb;
		try {
		pb = new ProcessBuilder(ruta);
		pb.start();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
		public static void main(String[] args) {
		String ruta="C:\\Program Files\\WinRAR\\WinRAR.exe";
		Lanzador lp=new Lanzador();
		lp.ejecutar(ruta);
		System.out.println("Finalizado");
		}
		}
