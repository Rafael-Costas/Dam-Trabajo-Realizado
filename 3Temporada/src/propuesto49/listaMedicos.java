package propuesto49;

import java.util.ArrayList;

public class listaMedicos {

	ArrayList<Medico> listaMedico;
	public listaMedicos() {
		this.listaMedico = new ArrayList<>();
	}
	
	public void añadirmedico(Medico med) {
		this.listaMedico.add(med);
	}
	public void listarMedico() {
		for (Medico medico : listaMedico) {
			System.out.println(medico);
		}
	}
	public void medicoConcreto() {
		for(Medico medico : listaMedico) {
			if(medico instanceof Ortopedista) {
				System.out.println(medico.getNombre()+ " es un Ortopedista");
			}
			if(medico instanceof Pediatra) {
				System.out.println(medico.getNombre()+ " es un Pediatra");
			}
			if(medico instanceof Medico) {
				System.out.println(medico.getNombre()+ " es un Medico");
			}
		}
	}
	
}
