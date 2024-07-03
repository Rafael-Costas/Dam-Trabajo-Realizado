package Estudio;

public class Cohetes {

	private static int numCohetes=0;
	
	Cohetes(){
		numCohetes++;
	}
	public static int Numero() {
		return numCohetes;
	}
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Cohetes a= new Cohetes();
			
		}
		
		System.out.println("La cantida de cohetes creados son"+ Numero());
	
	}

}