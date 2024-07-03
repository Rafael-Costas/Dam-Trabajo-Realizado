
public class Ejercicio4 {

	public static void main(String[] args) {
		//Crea un array de números de 100 posiciones, que contendrá los números del 1
		//al 100. Obtén la suma de todos ellos y la media.
		int Banana[]= new int [100];
		int cont=0;
		for(int i=1; i<=100; i++) {
			Banana[i-1]=i;
			cont+=i;
			
		}
		System.out.println("La suma es "+cont);
		System.out.println("La media es "+cont/100);
		for(int i=0; i<Banana.length; i++) {
			System.out.println(Banana[i]);
		}
	}
}
