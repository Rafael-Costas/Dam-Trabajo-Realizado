
public class bisiesto {
	public static void año(int año) {
		if(año%4==0) {
			if(año%100==0) {
				if(año%400==0) {
					System.out.println("Es bisiesto");
				}else {
					System.out.println("NO es");
				}
			}else {
				System.out.println("Es bisiesto");
			}
		}else {
			System.out.println("No es bisiesto");
		}
	}
	public static void main(String[] args) {
		
		
	}
}
