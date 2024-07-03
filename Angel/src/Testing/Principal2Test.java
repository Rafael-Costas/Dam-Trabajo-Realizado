package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Principal2Test {

	@Test
	void SeSUmaBien() {
	
		float a=Principal2.add(4, 3);
		assertEquals(7, a);
	}
	
	@Test
	void SumaDecimales() {
		Principal2 Abc = new Principal2();
		float a=Principal2.add(3.5f, 0.2f);
		assertEquals(3.7, a,0.01);
	}
	
	@Test
	void primeraLetra() {
	char a=Principal2.getFirstCharacter("hola");
		assertEquals('H', a);
	}
	@Test
	void PasarleUnNumero() {
	char a=Principal2.getFirstCharacter("123");
		assertEquals('1', a);
	}
	@Test
	void TestNull() {
	char a=Principal2.getFirstCharacter(null);
		assertEquals(0, a);
	}
	@Test
	void ArrayVacio() {
		float [] suma = {};
	 
		assertEquals(0, Principal2.SumArray(suma));
	}
	@Test
	void testSumOfNullArray() {
		float [] list = null;
	 
		assertEquals(0, Principal2.SumArray(list));
	}
	
	@Test
	void emptySpcae() {
	char a=Principal2.getFirstCharacter("");
		assertEquals(0, a);
	}
	@Test
	void SumaArrays() {
		float [] arr = {1,2,3};
	
		float a=Principal2.SumArray(arr);
		assertEquals(6, a);
	}

	@Test
	void NumMasAlto() {
		int [] arr = {1,2,3};
	
		int a=Principal2.getLargest(arr);
		assertEquals(3, a);
	}
	@Test
	void NumMasAltoPeroSinNumeros() {
		int [] arr = {};
	
		int a=Principal2.getLargest(arr);
		assertEquals(0, a);
	}
	@Test
	void NumMasAltoPeroNullo() {
		int [] arr =null;
	
		int a=Principal2.getLargest(arr);
		assertEquals(0, a);
	}
	
	@Test
	void largestNumberWithOnenumber() {
		int [] arr = {1};
	
		int a=Principal2.getLargest(arr);
		assertEquals(1, a);
	}

}
