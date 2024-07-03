package Cadenas;

import java.util.Arrays;

public class reto5 {

	public static void insertionsort(float [] numbers) {
		for(int i=0; i<numbers.length; i++) {
			float copyNumber = numbers[i];
			int j=i;
			while(j> 0 && copyNumber < numbers[j-1]) {
				numbers[j] = numbers[j-1];
				j--;
			}
			numbers[j]=copyNumber;
		}
	}
	public static void main(String[] args) {
		
		float [] Arr = {1.1f,2.34f,1.15f,7.3f,6.2f};
		System.out.println(Arrays.toString(Arr));
		insertionsort(Arr);
		System.out.println(Arrays.toString(Arr));
	}
}
