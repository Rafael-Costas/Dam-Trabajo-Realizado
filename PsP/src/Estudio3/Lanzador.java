package Estudio3;

import java.io.File;



public class Lanzador {

	public void lanzarSumador(Integer n1, Integer n2, String fichResultado) {
		String clase =System.getProperty("user.dir")+ "\\src\\Estudio3\\Sumador.java";
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder("java", clase, n1.toString(), n2.toString());

			pb.redirectError(new File("errores.txt"));
			pb.redirectOutput(new File(fichResultado));
			pb.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String classPath = System.getProperty("user.dir");
		Lanzador l = new Lanzador();
		l.lanzarSumador(1, 5, "result11.txt");
		l.lanzarSumador(6, 10, "result22.txt");
		System.out.println("Ok");
	}
}
