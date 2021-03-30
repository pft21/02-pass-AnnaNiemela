package _pass_AnnaNiemela.Calculator;

import static org.junit.Assert.*;
import java.util.Random;

import org.junit.Test;

public class AdvancedCalculatorTest {
	Random r = new Random();
	AdvancedCalculator a = new AdvancedCalculator();

	@Test
	public void testSquareRoot() {

		// positive
		for (int i = 0; i < 10; i++) {
			double value = r.nextDouble() * 10;
			double result = Math.sqrt(value);
			assertEquals(a.squareRoot(value), result, 0);
		}
		// negative
		for (int i = 0; i < 10; i++) {
			double value = r.nextDouble() * 10 - 10;
			double result = Math.sqrt(value);
			assertEquals(a.squareRoot(value), result, 0);
		}
		// zero
		double value = 0;
		double result = Math.sqrt(value);
		assertEquals(a.squareRoot(value), result, 0);
	}

	@Test
	public void testToThePowerOf() {

		// positive
		for (int i = 0; i < 10; i++) {
			double firstArgument = r.nextDouble() * 10;
			double secondArgument = r.nextDouble() * 10;
			double result = Math.pow(firstArgument, secondArgument);
			assertEquals(a.toThePowerOf(firstArgument, secondArgument), result, 0);
		}
		// negative
		for (int i = 0; i < 10; i++) {
			double firstArgument = r.nextDouble() * 10 - 10;
			double secondArgument = r.nextDouble() * 10 - 10;
			double result = Math.pow(firstArgument, secondArgument);
			assertEquals(a.toThePowerOf(firstArgument, secondArgument), result, 0);
		}
		// zero
		double firstArgument = 0;
		double secondArgument = 0;
		double result = Math.pow(firstArgument, secondArgument);
		assertEquals(a.toThePowerOf(firstArgument, secondArgument), result, 0);
	}

	@Test
	public void testAbsoluteValue() {

		// positive
		for (int i = 0; i < 10; i++) {
			double value = r.nextDouble() * 10;
			double result = Math.abs(value);
			assertEquals(a.absoluteValue(value), result, 0);
		}
		// negative
		for (int i = 0; i < 10; i++) {
			double value = r.nextDouble() * 10 - 10;
			double result = Math.abs(value);
			assertEquals(a.absoluteValue(value), result, 0);
		}
		// zero
		double value = 0;
		double result = Math.abs(value);
		assertEquals(a.absoluteValue(value), result, 0);
	}

	@Test
	public void testPercentageOf() {

		// positive
		for (int i = 0; i < 10; i++) {
			double percentage = r.nextDouble() * 10;
			double ofValue = r.nextDouble() * 10;
			double result = (percentage * ofValue) / 100;
			assertEquals(a.percentageOf(percentage, ofValue), result, 0);
		}
		// negative
		for (int i = 0; i < 10; i++) {
			double percentage = r.nextDouble() * 10 - 10;
			double ofValue = r.nextDouble() * 10 - 10;
			double result = (percentage * ofValue) / 100;
			assertEquals(a.percentageOf(percentage, ofValue), result, 0);
		}
		// zero
		double percentage = 0;
		double ofValue = 0;
		double result = (percentage * ofValue) / 100;
		assertEquals(a.percentageOf(percentage, ofValue), result, 0);
	}

	@Test
	public void testCubeRoot() {

		// positive
		for (int i = 0; i < 10; i++) {
			double value = r.nextDouble() * 10;
			double result = Math.cbrt(value);
			assertEquals(a.cubeRoot(value), result, 0);
		}
		// negative
		for (int i = 0; i < 10; i++) {
			double value = r.nextDouble() * 10 - 10;
			double result = Math.cbrt(value);
			assertEquals(a.cubeRoot(value), result, 0);
		}
		// zero
		double value = 0;
		double result = Math.cbrt(value);
		assertEquals(a.cubeRoot(value), result, 0);
	}

}
