package Materia;

public class testTelefono {

	public static void main(String[] args) {

		telefono ModeloBarato = new telefono(2);
		telefono ModeloMedio = new telefono(4);

		ModeloBarato.Llamar("670879078");
		ModeloBarato.Llamar("670674590");
		System.out.println(ModeloBarato.UltimaLlamada());
		ModeloBarato.Llamar("670234590");
		ModeloBarato.Llamar("670069423");
		System.out.println(ModeloBarato.Llamada(1));
		//afrodita tiene
		ModeloMedio.Llamar("670879078");
		ModeloMedio.Llamar("670674590");
		System.out.println(ModeloMedio.UltimaLlamada());
		ModeloMedio.Llamar("670234590");
		ModeloMedio.Llamar("670069423");
		ModeloMedio.Llamar("670069498");
		ModeloMedio.Llamar("670069499");
		System.out.println(ModeloMedio);
		System.out.println(ModeloMedio.Llamada(1));

	}
}
