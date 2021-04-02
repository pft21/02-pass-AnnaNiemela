package _pass_AnnaNiemela.Calculator;

import static org.junit.Assert.*;
import java.util.Random;

import org.junit.Test;

public class BasicCalculatorTest {
	Random r = new Random();
	BasicCalculator b = new BasicCalculator();

	@Test
	public void testAddition() {
		// positive
		for (int i = 0; i < 10; i++) {
			double firstValue = r.nextDouble() * 10;
			double secondValue = r.nextDouble() * 10;
			double result = firstValue + secondValue;
			assertEquals(b.addition(firstValue, secondValue), result, 0);
		}
		// negative
		for (int i = 0; i < 10; i++) {
			double firstValue = r.nextDouble() * 10 - 10;
			double secondValue = r.nextDouble() * 10 - 10;
			double result = firstValue + secondValue;
			assertEquals(b.addition(firstValue, secondValue), result, 0);
		}
		// zero
		double firstValue = 0;
		double secondValue = 0;
		double result = firstValue + secondValue;
		assertEquals(b.addition(firstValue, secondValue), result, 0);
	}

	@Test
	public void testSubtraction() {
		// positive
		for (int i = 0; i < 10; i++) {
			double firstValue = r.nextDouble() * 10;
			double secondValue = r.nextDouble() * 10;
			double result = firstValue - secondValue;
			assertEquals(b.subtraction(firstValue, secondValue), result, 0);
		}
		// negative
		for (int i = 0; i < 10; i++) {
			double firstValue = r.nextDouble() * 10 - 10;
			double secondValue = r.nextDouble() * 10 - 10;
			double result = firstValue - secondValue;
			assertEquals(b.subtraction(firstValue, secondValue), result, 0);
		}
		// zero
		double firstValue = 0;
		double secondValue = 0;
		double result = firstValue - secondValue;
		assertEquals(b.subtraction(firstValue, secondValue), result, 0);
	}

	@Test
	public void testMultiplication() {
		// positive
		for (int i = 0; i < 10; i++) {
			double firstValue = r.nextDouble() * 10;
			double secondValue = r.nextDouble() * 10;
			double result = firstValue * secondValue;
			assertEquals(b.multiplication(firstValue, secondValue), result, 0);
		}
		// negative
		for (int i = 0; i < 10; i++) {
			double firstValue = r.nextDouble() * 10 - 10;
			double secondValue = r.nextDouble() * 10 - 10;
			double result = firstValue * secondValue;
			assertEquals(b.multiplication(firstValue, secondValue), result, 0);
		}
		// zero
		double firstValue = 0;
		double secondValue = 0;
		double result = firstValue * secondValue;
		assertEquals(b.multiplication(firstValue, secondValue), result, 0);
	}

	@Test
	public void testDivision() {
		// positive
		for (int i = 0; i < 10; i++) {
			double firstValue = r.nextDouble() * 10;
			double secondValue = r.nextDouble() * 10;
			double result = firstValue / secondValue;
			assertEquals(b.division(firstValue, secondValue), result, 0);
		}
		// negative
		for (int i = 0; i < 10; i++) {
			double firstValue = r.nextDouble() * 10 - 10;
			double secondValue = r.nextDouble() * 10 - 10;
			double result = firstValue / secondValue;
			assertEquals(b.division(firstValue, secondValue), result, 0);
		}
		// zero
		double firstValue = 0;
		double secondValue = 0;
		double result = -0.123456789;
		assertEquals(b.division(firstValue, secondValue), result, 0);
	}
}
