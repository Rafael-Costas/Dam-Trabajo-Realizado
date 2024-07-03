package CarreraCiclista2;

public class test {

	public static void main(String[] args) {
		Torneo Vuela= new Torneo("Vida", "muerte");
		
		
		
		Equipo Francia = new Equipo("Franchute", "Bagget");
		Equipo España = new Equipo("España", "Galicia");
		
		Velocista velocista = new Velocista(1, "Geraint Thomas",  43, 43);
		Escalador escalador = new Escalador(3, "Egan Bernal",  1, 2);
		Contrarrelojista contra = new Contrarrelojista(4, "Jonathan Castroviejo",  32);
		
		
		Velocista Rajoy = new Velocista(1, "M.Rajoy",  43, 43);
		Escalador Obama = new Escalador(3, "Obama",  1, 2);
		Contrarrelojista Odin = new Contrarrelojista(4, "Odin",  32);
	España.añadirCicilista(Odin);
	España.añadirCicilista(Rajoy);
	España.añadirCicilista(Obama);
	
	España.calcularTotalTiempo();
	for(int i=0; i<España.listaCiclistas.size(); i++)
	System.out.println(España.listaCiclistas.get(i).toString());

	Odin.setTiempoAcumulado(4);
	Rajoy.setTiempoAcumulado(1);
	Obama.setTiempoAcumulado(8);
	España.calcularTotalTiempo();

	
	España.ordernarPosiciones();
	
	for(int i=0; i<España.listaCiclistas.size(); i++)
	System.out.println(España.listaCiclistas.get(i).toString());
	
	Vuela.añadirEquipos(España);
	Vuela.añadirEquipos(Francia);
	System.out.println("Clasificacion general ordenada");
	Vuela.imprimirClasificacion();
	
	System.out.println("Clasificacion por equipos ");
	Vuela.clasificaionPorEquipos();
	Vuela.listarEquipos();
	
	}

	
}
