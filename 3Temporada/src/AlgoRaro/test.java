package AlgoRaro;

public class test {

	public static void main(String[] args) throws ClassNotFoundException {
		Asignatura asignatura = new Asignatura(4100547, "Programacion orientada a objetos", 4);
		asignatura.escribirAsignatura();
		asignatura.leerAsignatura();
	}
}
