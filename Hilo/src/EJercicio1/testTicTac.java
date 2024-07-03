package EJercicio1;

public class testTicTac {

	public static void main(String[] args) {
		System.out.println("Prueba de TicTac");
		
		Tac tac=new Tac("Tac.................");
		Tic tic=new Tic("Tic......");
		tac.start();
	
		tic.start();
		try {
			tac.join();
			tic.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
