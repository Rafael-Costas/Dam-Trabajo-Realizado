package Cadenas;

import java.util.Arrays;

public class reto4 {

public static void burbuja(String [] Arr) {
		
		String aux; 
		
	
		
		for(int i=Arr.length; i>0; i--) {
			for(int j=0; j<i-1;j++) {
				
				if(Arr[j].compareTo(Arr[j+1])>0) {
					aux =Arr[j+1];
					Arr[j+1]=Arr[j];
					Arr[j]=aux;
				}
			}
		}
	}
	public static void main(String[] args) {
		String [] arr = {"uno","dos","tres","cuatro","Cinco","seis","siete","ocho","nueve","diez"};
		String Palabra=arr[0];
		//System.out.println(Palabra.compareTo(arr[1]));
		System.out.println(Arrays.toString(arr));
		burbuja(arr);
		System.out.println(Arrays.toString(arr));
		
		String [] arr2 = {"uno","dos","tres","cuatro","Cinco","seis","siete","ocho","nueve","diez"};
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
