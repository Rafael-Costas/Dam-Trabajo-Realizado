package Anomalos;

public class LasVacas {

	public static void main(String[] args) {
		
		int [] arr = new int [20];
		arr[0]=1;
		arr[1]=1;
		arr[2]=2;
		for(int i=3; i < arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-3];
		}
		
		System.out.println("Se ha generado el array: [");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("]");
	}
}

