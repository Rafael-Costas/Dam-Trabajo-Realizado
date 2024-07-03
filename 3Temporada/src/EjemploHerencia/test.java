package EjemploHerencia;

public class test {

	public static void main(String[] args) {
		Libro MiLibro = new Libro(575, 15.2f, "La vida Invisible de Adeline", "Portada fina", "123456","Una buena persona","Kpse antonio");
		Periodico TuPeriodico = new Periodico(64, 1.5f, "Fora de bigo", "Ayer");
		
		System.out.println(TuPeriodico.toString());
	
	}
}
