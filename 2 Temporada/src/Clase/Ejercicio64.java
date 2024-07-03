package Clase;

public class Ejercicio64 {

	/*
	 * metodo que recoge un array de enteros
	 * y lo devuelva como un string
	 */
	
	public static String obteneStringdeArrays(int[] arr) {
		String devolver="";
		/*for(int i=0; i<arr.length; i++) {
			devolver+=arr[i];
		}*/
		
		
		//i lo que hace es coger el valor del array, vease no coge el indice
		for (int i : arr) {
			
			devolver +=i;
		}
		return devolver;
	}
	
	public static void main(String[] args) {
		
		int [] arr= {54,55,56,57,58};
		
		System.out.println(obteneStringdeArrays(arr));
		
		
		String [] palabras = {"Lun", "Mar", "Mier","JUEVES","vier","Sab","Domin"};
		
		for (String string : palabras) {
			System.out.println(string);
			
		}
		
	}
}
