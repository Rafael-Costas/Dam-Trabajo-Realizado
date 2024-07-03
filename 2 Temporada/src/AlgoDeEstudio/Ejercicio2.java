package AlgoDeEstudio;

public class Ejercicio2 {
	static void qsort(char item[]) {
		qs(item, 0, item.length-1);
	}
	
	private static void qs(char items[], int left, int right) {
		int i,j;
		char x,y;
		
		i= left; 
	}
	
	public static void main(String[] args) {
		/*
		 * Genera un array de 50 posiciones enteras que tomarán valores entre - 100 y
		 * 100. Separe en dos matrices los valores positivos (incluido el cero) y los
		 * negativos en otra. Ordene ambos arrays por el método Quicksort.
		 */
		int  [] Banana= new int  [50];
		
		for(int i=0; i<50; i++) {
			Banana[i]= (int) (-100+(Math.random()*(199+1)+1));
		}
		for(int i=0; i<50; i++) {
			if(Banana[i]<0) {
				
			}
		}
		
	}
}
