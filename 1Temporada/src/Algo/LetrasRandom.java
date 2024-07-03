package Algo;

public class LetrasRandom {
	public static char getLetras() {
		return (char) (Math.random() * 26 + 'a');}
	public static void main(String[] args) {
		
		int voval=0;
		int conso=0;
		char letra;
		for(int i=0; i<10; i++) {
		letra= getLetras();
			if(letra== 'a' ||letra== 'e' ||letra== 'i' ||letra== 'o' ||letra== 'u' ) {
			System.out.println(letra+" es vocal");
			voval++;
		}else {
			System.out.println(letra+" es consonates");
			conso++;
		}}
		System.out.println("Hay "+voval+ " Vocales");
		System.out.println("Hay "+conso+ " consonantes");
	}
}
