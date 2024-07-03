package Ejercicios;

import java.util.Arrays;

public class Ejercicico61 {

	public static void main(String[] args) {
		int[] Arr1 = new int [10];
		for(int i=0; i<Arr1.length; i++){
			Arr1[i]=i;
		}
		System.out.println(Arrays.toString(Arr1));
		
		int[] Arr2 = new int [10];
		for(int i=0; i<Arr2.length; i++){
			Arr2[i]=(Arr2.length-1)-i;
		}
		System.out.println(Arrays.toString(Arr2));

	
		char[] Arrchar1 = {'a','e','i','o','u'};
		System.out.println(Arrays.toString(Arrchar1));
		char[] Arrchar2 = new char[5];
	for(int i =0; i<Arrchar2.length; i++) {
		Arrchar2[i]=(char)('a'+i);
	}

	System.out.println(Arrays.toString(Arrchar2));
	
	//Concatenar las vocales del array char auna cadena de caracteres de nombre cad
	
	String cadena="";
	for(int i=0; i<Arrchar1.length; i++) {
		cadena+=Arrchar1[i];
	}
	System.out.println(cadena);
	
	
	//obtener una cadena de caracteres, de nombre cadCh2, con las 5 letras del array arrch2
	String cadena2="";
	for(int i=0; i<Arrchar2.length; i++) {
		cadena+=Arrchar2[i];
	}
	System.out.println(cadena2);
	
	
	//7 intercalar los dos arrays 
	
	String cadena3="";
	for(int j=0; j<Arrchar1.length; j++) {
		cadena3+=Arrchar1[j];
		cadena3+=Arrchar2[j];
		
	}
	
	//8 Sumar dos posisiciones de diferebntes arrays
	int [] dig3=new int [Arrchar1.length];
	for(int i=0; i<Arrchar1.length; i++) {
		dig3[i]=Arrchar1[i]+Arrchar2[i];
	}
	
	
	}
	
}
