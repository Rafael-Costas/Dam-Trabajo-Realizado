package propuesto49;

public class Test {

	public static void main(String[] args) {
		Ortopedista jose = new Ortopedista("Jose", Ortopedista.tipologia.pediatria);
		Pediatra ana = new Pediatra("Ana", Pediatra.tipologia.Psicologo);
		Ortopedista Ricarda = new Ortopedista("Jose", Ortopedista.tipologia.maxilofacial);
		Pediatra eduarda = new Pediatra("Ana", Pediatra.tipologia.Neurologo);
		
	System.out.println(	jose.toString());
	System.out.println(	ana.toString());
	
	listaMedicos abc = new listaMedicos();
	abc.añadirmedico(jose);
	abc.añadirmedico(ana);
	abc.añadirmedico(Ricarda);
	abc.añadirmedico(eduarda);
	abc.listarMedico();
	abc.medicoConcreto();
	
	}
}
