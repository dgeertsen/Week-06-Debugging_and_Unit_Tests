package unitTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import myMath.Math;


class MathTest {

	Math math = new Math();
	@Test
	void testMultiplyReturnsCorrectValue() {
		int product = math.multiply(2,5);
		assertEquals(10,product);
	}
	
	/*
	 * @Test void testDivideReturnCorrectValue() { int result =
	 * math.divide(5.0,2.0); assertEquals(2.5,result);
	 */
	//}
	
	@Test
	void testIsPositveCorrectValue() {
		int a = 5;
		assertTrue(math.isPositive(a));
	}
	@Test
	void throwsExceptionWhenDividing() {
		assertThrows(ArithmeticException.class, () -> math.divide(5, 0));
		
	}
}
