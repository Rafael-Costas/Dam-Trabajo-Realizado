package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void testPlusWithNormalNumbers() {
		Principal app= new Principal();
		float r =app.Plus(2, 4);
		assertEquals(8, r);
	}
	@Test
	void testPlusWithDecimals() {
		Principal app= new Principal();
		float r =app.Plus(2.5f, 2.5f);
		assertEquals(6.25, r);
	}
	
	

	@Test
	void testIntegerNumber() {
		Principal app= new Principal();
		float r =app.div(4, 2);
	
		assertEquals(2, r);
	}
	
	@Test
	void testMultiplyResultWithDEcimals() {
		Principal app= new Principal();
		float r =app.Plus(1.25f, 3.12f);
		assertEquals(3.89, r, 0.01);
	}
	@Test
	void testDivideDEcimalResult() {
		Principal app= new Principal();
		float r =app.div(3, 2);
		assertEquals(1.5, r);
	}

	@Test
	void testUpper() {
		Principal app= new Principal();
		char r= app.Upper("Casa");
		assertEquals('C', r);
	}

}
