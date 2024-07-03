
public class Palindrome {

	public static void main(String[] args) {
		String palindromo = "Ana";
		String palindromo2 = "ana bana";
		palindromo=palindromo.replaceAll(" ", "");

		StringBuilder a= new StringBuilder(palindromo2);
		a.reverse();
		
		String ejemplo ="";
		for(int i=palindromo.length()-1; i>=0; i--) {
			ejemplo+=palindromo.charAt(i);
			
		}
		
		palindromo= palindromo.toLowerCase();
		ejemplo=ejemplo.toLowerCase();
		System.out.println(palindromo);
		System.out.println(ejemplo);
		if(palindromo.equals(ejemplo)) {
			System.out.println("es palindromo");
		}else {
			System.out.println("Que va");
		}
	
	
	if(a==a.reverse()) {
		System.out.println("Es palindromo");
		
	}else {
		System.out.println("No es palindromo");
	}
	}
}
