package Ejercicio5;

public class test {

	public static void main(String[] args) {
		Torneo Etapa1= new Torneo("Vuelta1", "Madrid");
		Torneo Etapa2= new Torneo("Vuelta2", "Francia");
		Torneo Etapa3= new Torneo("Vuelta3", "Zaragoza");
		Torneo Etapa4= new Torneo("Vuelta4", "Tokyo");
		
		
		
		Equipo Francia = new Equipo("Francia", "francia");
		Equipo España = new Equipo("España", "pulpo");
		Equipo Bolivia = new Equipo("Bolivia", "Mar");
		Equipo China = new Equipo("China", "shusi");
		
		
		Velocista velocista = new Velocista(1, "Geraint Thomas",  43, 43);
		Escalador escalador = new Escalador(3, "Egan Bernal",  1, 2);
		Contrarrelojista contra = new Contrarrelojista(4, "Jonathan Castroviejo",  32);
		
		
		Velocista Rajoy = new Velocista(1, "M.Rajoy",  43, 43);
		Escalador Obama = new Escalador(3, "Obama",  1, 2);
		Contrarrelojista Odin = new Contrarrelojista(4, "Odin",  32);
		
		Velocista Mortadelo = new Velocista(1, "Mortadelo",  43, 43);
		Escalador filemon = new Escalador(3, "filemon",  1, 2);
		Contrarrelojista tia = new Contrarrelojista(4, "tia",  32);
		
		
		Velocista Ramon = new Velocista(1, "Ramon",  43, 43);
		Escalador Cajal = new Escalador(3, "Cajal",  1, 2);
		Contrarrelojista Marcos = new Contrarrelojista(4, "Marcos",  32);
		
		
	
		
		
	España.añadirCicilista(Odin);
	España.añadirCicilista(Rajoy);
	España.añadirCicilista(Obama);
	
	
	Francia.añadirCicilista(velocista);
	Francia.añadirCicilista(contra);
	Francia.añadirCicilista(escalador);
	
	Bolivia.añadirCicilista(Mortadelo);
	Bolivia.añadirCicilista(filemon);
	Bolivia.añadirCicilista(tia);
	
	China.añadirCicilista(Ramon);
	China.añadirCicilista(Cajal);
	China.añadirCicilista(Marcos);
	
	/*España.calcularTotalTiempo();
	for(int i=0; i<España.listaCiclistas.size(); i++)
	System.out.println(España.listaCiclistas.get(i).toString());

	Odin.setTiempoAcumulado(4);
	Rajoy.setTiempoAcumulado(1);
	Obama.setTiempoAcumulado(8);
	España.calcularTotalTiempo();

	
	España.ordernarPosiciones();
	
	for(int i=0; i<España.listaCiclistas.size(); i++)
	System.out.println(España.listaCiclistas.get(i).toString());
	*/
	Etapa1.añadirEquipos(China);
	Etapa1.añadirEquipos(Francia);
	Etapa1.añadirEquipos(España);
	Etapa1.añadirEquipos(Bolivia);
	
	Etapa2.añadirEquipos(China);
	Etapa2.añadirEquipos(Francia);
	Etapa2.añadirEquipos(España);
	Etapa2.añadirEquipos(Bolivia);

	Etapa3.añadirEquipos(China);
	Etapa3.añadirEquipos(Francia);
	Etapa3.añadirEquipos(España);
	Etapa3.añadirEquipos(Bolivia);
	
	
	Etapa4.añadirEquipos(China);
	Etapa4.añadirEquipos(Francia);
	Etapa4.añadirEquipos(España);
	Etapa4.añadirEquipos(Bolivia);
	
	Etapa1.ordernarPosiciones();
	
	Etapa1.imprimirClasificacion();
	Etapa2.imprimirClasificacion();
	
	
	}

	
}
