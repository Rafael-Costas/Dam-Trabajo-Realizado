package Anomalos;

public class ProcedimientoSinInicializar {
	
	
	
	public static void main(String[] args) {
	
		int [] arr = new int [20];
		arr[0]=1;
		for(int i=1; i < arr.length; i++) {
			arr[i]=3* arr[i-1];
		}
		
		
		System.out.println("Se ha generado el array: [");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		System.out.println("]");
	}
}
