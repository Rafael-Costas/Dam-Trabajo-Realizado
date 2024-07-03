package Ejercicios;

import java.util.Arrays;

public class Ejercicio71 {

	public static String pegaCadenas(String [] arr) {
		
		if(arr==null) {
			throw new IllegalArgumentException("SUBNORMAL el array no vale") ;
				
			
		}
		String larga="";
		for(int i=0; i<arr.length; i++) {
			larga=larga+arr[i];
		}
		return larga;
	}
	
	public static void  main(String[] args) {
		
		String [] frases = {"Hola ", "que ", "que ", "tal "};
		String larga=pegaCadenas(frases);
		System.out.println(larga);
		
		String cosa=" SNABSAS ASJ A SABN SANB SNAB DNAM SMAJABCK kj vdsnv ksd vkjsd vdks vkdns vns sin o w wonecow ewv wf ewd ew";
		String [] cad = cosa.split(" ");
		System.out.println(Arrays.toString(cad));
		
		larga=pegaCadenas(cad);
		System.out.println(larga);
		
		String []cad2 = null;
		pegaCadenas(cad2);
	}
}
