import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calc;
	int sum;
	int a, b;
	@Test
	public void test() {
		testPos();
		//testNeg();
		//testMax();
	}
	
	public void testPos() {
		a = 10;
		b = 25;
		sum = 35;
		System.out.print(sum);
		assertEquals(35,sum);
	}
	
	public void testNeg() {
		a = -10;
		b = -25;
		sum = calc.a
	}
	
	public void testMax() {
		
	}
}
