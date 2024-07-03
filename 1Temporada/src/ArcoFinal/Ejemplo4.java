package ArcoFinal;

public class Ejemplo4 {

	public static void main(String[] args) {
		int num=1;
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		System.out.println("FIN DE TODO");
		num=0;
		do{
			
			System.out.println(num);
			num++;
		}while(num<=10);
		System.out.println("FIN DE TODO");
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}System.out.println("FIN DE TODO");
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
	}
}
