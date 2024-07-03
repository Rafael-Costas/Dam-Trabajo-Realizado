package Estudio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2C {

	public static void insertionsort(int [] arr) {
		 {
		        int n = arr.length;
		        for (int i = 1; i < n; ++i) {
		            int key = arr[i];
		            int j = i - 1;
		            while (j >= 0 && key > arr[j] ) {
		                arr[j + 1] = arr[j];
		                j = j - 1;
		            }
		            arr[j + 1] = key;
		        }
		    }
	}
	
	public static int[] fusionar(int [] Arr, int [] Arr2){
		
		
		int [] res = new int [Arr.length*2];
		int cont1=0;
		int cont2=0;
		for(int i=0; i<res.length; i++){
			if(cont1<Arr.length && cont2<Arr2.length) {
				if(Arr[cont1]>=Arr2[cont2]) {
					res[i]=Arr[cont1];
					cont1++;
					if(cont1==Arr.length) {
						i++;
					}
				}else {
					res[i]=Arr2[cont2];
					cont2++;
					if(cont2==Arr2.length) {
						i++;
					}
				}
			}
			
			if(cont1<Arr.length && cont2>=Arr2.length) {
				res[i]=Arr[cont1];
				cont1++;
			}
			if(cont2<Arr2.length && cont1>=Arr.length) {
				res[i]=Arr2[cont2];
				cont2++;
			}
			}
		return res;
	}
	public static void main(String[] args) {
		
	
	Scanner src= new Scanner(System.in);
	int [] Arr = new int [6];
	int [] Arr2 = new int [6];
	for(int i=0; i<Arr.length; i++) {
		System.out.println("Introduce numeros");
		Arr[i]=src.nextInt();
	}
	System.out.println("Ahora pasamos al segundo Array");
	for(int i=0; i<Arr2.length; i++) {
		System.out.println("Introduce numeros");
		Arr2[i]=src.nextInt();
	}
	insertionsort(Arr);
	insertionsort(Arr2);
	System.out.println(Arrays.toString(Arr));
	System.out.println(Arrays.toString(Arr2));
	
	/*
	int cont1=0;
	int cont2=0;
	for(int i=0; i<res.length; i++){
		if(cont1<Arr.length && cont2<Arr2.length) {
			if(Arr[cont1]>=Arr2[cont2]) {
				res[i]=Arr[cont1];
				cont1++;
				if(cont1==Arr.length) {
					i++;
				}
			}else {
				res[i]=Arr2[cont2];
				cont2++;
				if(cont2==Arr2.length) {
					i++;
				}
			}
		}
		
		if(cont1<Arr.length && cont2>=Arr2.length) {
			res[i]=Arr[cont1];
			cont1++;
		}
		if(cont2<Arr2.length && cont1>=Arr.length) {
			res[i]=Arr2[cont2];
			cont2++;
		}
		}*/
	int [] res = new int [Arr.length*2];
		res=	fusionar(Arr, Arr2);
	System.out.println(Arrays.toString(res));
	
	}
}
