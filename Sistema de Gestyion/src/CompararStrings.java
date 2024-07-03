
public class CompararStrings {

	public static void main(String[] args) {
		
		String frase = "Hola buenas";

		String frase2 = "Que te jodan";
		boolean igual = true;
		if(frase.length()!=frase2.length()) {
			igual =false;
		}else {
			for(int i=0; i<frase.length(); i++) {
				if(frase.charAt(i)!=frase2.charAt(i)) {
					igual=false;
				}
			}
		}
		if(igual) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
	}
}
