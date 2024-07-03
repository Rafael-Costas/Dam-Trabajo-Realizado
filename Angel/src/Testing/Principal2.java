package Testing;

import java.util.Arrays;

public class Principal2 {
	
	public static float add(float n1, float n2) {
		return n1+n2;
	}
	public static char getFirstCharacter(String text) {
	if(text==null) return 0;
	if(text.equals("")) {
		return 0;
	}else {
		return text.toUpperCase().charAt(0);
	}
		
	}
	public static float SumArray(float[] Arr) {
		float total=0;
		if(Arr==null) {
			return total=0;
		}
		for(int i=0; i<Arr.length; i++) {
			total+= Arr[i];
		}
		
		return total;
	
	}
	
	public static int getLargest(int[] numberList) {
		int alto=0;
	/*	for(int i=0; i<numberList.length; i++) {
			if(numberList[i]>alto) {
				alto=numberList[i];
			}
		}*/
		if(numberList==null) {
			return 0;
		}
		for (int i : numberList) {
			if(alto<i) {
				alto=i;			}
		}
		return alto;
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
