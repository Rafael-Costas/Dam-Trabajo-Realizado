package Estudio;

public class testVar {

	public static int var;
	public int var2;
	public void prueba() {
		testVar.var=3;
		var2=5;
		
	}
	public static void main(String[] args) {
		testVar t= new testVar();
		
		//metodo de instancia o de objeto, vease 
		//necesita un objeto para poder usar el metodo
		t.prueba();
		
	}
}
