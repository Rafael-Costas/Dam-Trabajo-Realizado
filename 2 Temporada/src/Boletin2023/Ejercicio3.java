package Boletin2023;

public class Ejercicio3 {

	/*
	 * 3. Leer 5 números por teclado y a continuación realizar la media de los
	 * números positivos, la media de los negativos y contar el número de ceros.
	 */
	
	
	public static void main(String[] args) {
		
		int [] Arr= {1,2,-3,-4,0};
		int contp=0;
		int contn=0;
		int medp=0;
		int medn=0;
		int ceros=0;
	
		for(int i=0; i<Arr.length; i++) {
			if(Arr[i]>0) {
				contp+=Arr[i];
				 medp++;
			}
			if(Arr[i]<0) {
				contn+=Arr[i];
				medn++;
			}
			if(Arr[i]==0) {
				ceros++;
			}
			
		}
		System.out.println("La media de los numeros positivos es "+contp/medp);
		System.out.println("La media de los numeros positivos es "+contn/medn);
		System.out.println("La cantidad de ceros es "+ceros);
	
	}
}
