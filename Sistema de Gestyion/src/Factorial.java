
public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}
	public static int factorial(int num){
		if(num==1)
		return num;
		else
			return num*factorial(num-1);
	}
}
