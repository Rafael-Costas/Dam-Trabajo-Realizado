package Anomalos;

import java.util.Arrays;

public class PrimerosPares {

	
	public static void main(String[] args) {
		int [] Arr= new int [100];
		
		for(int i=0; i<Arr.length; i++) {
			Arr[i]=i*2;
		}
		System.out.println(Arrays.toString(Arr));
		
	}
}
