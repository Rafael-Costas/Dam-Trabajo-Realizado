package Clase;

public class Ejemplo9 {

	public static void mostrarArrays(char [ ] arr) {
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
	String cad1= "     MAYKA ES  MI TIA        ";
	String cad2=cad1.trim();
		System.out.println(cad2);	
	
		String cad3="PEDRO ruiz"; 
		System.out.println(cad3.toLowerCase());
		
		String cad4 ="tu puta madre";
		System.out.println(cad4.toUpperCase());
		
		//conversion de un  objeto string an un array de acaracteres
		String cad5="BANANA GUACAMELo";
		char[] arr = cad5.toCharArray();
		System.out.println(arr);
		//como convertir un array de caracteres a un objeto String
		
		String cad6=new String(arr);
		
		System.out.println(cad6);
		
	
	}
}
