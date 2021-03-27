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
		double firstValue = r.nextDouble() * 10;
		double secondValue = r.nextDouble() * 10;
		double result = firstValue + secondValue;
		assertEquals(b.addition(firstValue, secondValue), result, 0);
		
		// zero
		firstValue = 0;
		secondValue = 0;
		result = firstValue + secondValue;
		assertEquals(b.addition(firstValue, secondValue), result, 0);
		
		//negative
		firstValue = r.nextDouble() * 10 - 20;
		secondValue = r.nextDouble() * 10 - 20;
		result = firstValue + secondValue;
		assertEquals(b.addition(firstValue, secondValue), result, 0);
	}
	
	@Test
	public void testSubtraction() {
		
		// positive
		double firstValue = r.nextDouble() * 10;
		double secondValue = r.nextDouble() * 10;
		double result = firstValue - secondValue;
		assertEquals(b.subtraction(firstValue, secondValue), result, 0);
		
		// zero
		firstValue = 0;
		secondValue = 0;
		result = firstValue - secondValue;
		assertEquals(b.subtraction(firstValue, secondValue), result, 0);
		
		//negative
		firstValue = r.nextDouble() * 10 - 20;
		secondValue = r.nextDouble() * 10 - 20;
		result = firstValue - secondValue;
		assertEquals(b.subtraction(firstValue, secondValue), result, 0);
	}
	
	@Test
	public void testMultiplication() {
		
		// positive
		double firstValue = r.nextDouble() * 10;
		double secondValue = r.nextDouble() * 10;
		double result = firstValue * secondValue;
		assertEquals(b.multiplication(firstValue, secondValue), result, 0);
		
		// zero
		firstValue = 0;
		secondValue = 0;
		result = firstValue * secondValue;
		assertEquals(b.multiplication(firstValue, secondValue), result, 0);
		
		//negative
		firstValue = r.nextDouble() * 10 - 20;
		secondValue = r.nextDouble() * 10 - 20;
		result = firstValue * secondValue;
		assertEquals(b.multiplication(firstValue, secondValue), result, 0);
	}
	
	@Test
	public void testDivision() {
		
		// positive
		double firstValue = r.nextDouble() * 10;
		double secondValue = r.nextDouble() * 10;
		double result = firstValue / secondValue;
		assertEquals(b.division(firstValue, secondValue), result, 0);
		
		// zero
		firstValue = 0;
		secondValue = 0;
		result = -0.123456789;
		assertEquals(b.division(firstValue, secondValue), result, 0);
		
		//negative
		firstValue = r.nextDouble() * 10 - 20;
		secondValue = r.nextDouble() * 10 - 20;
		result = firstValue / secondValue;
		assertEquals(b.division(firstValue, secondValue), result, 0);
		
	}

}
