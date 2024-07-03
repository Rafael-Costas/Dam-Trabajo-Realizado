package Boletin2023;

public class Ejercicio4 {

	/*
	 * 4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el
	 * primero, el último, el segundo, el penúltimo, el tercero, etc.
	 */
	public static void main(String[] args) {
		int [] Arr= {1,2,3,4,5,6,7,8,9,10,11};
		
		if(Arr.length/2==0) {
			for(int i=0; i<Arr.length/2; i++) {
				System.out.print(Arr[i]+", ");
				System.out.print(Arr[(Arr.length-1)-i]+", ");
			}
		}else {
			for(int i=0; i<=Arr.length/2; i++) {
				System.out.print(Arr[i]+", ");
			if(i!=Arr.length/2) {
				System.out.print(Arr[(Arr.length-1)-i]+", ");
			}
			}
		
			
		
		}}
}
