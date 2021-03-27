package _pass_AnnaNiemela.Calculator;

import static org.junit.Assert.*;
import java.util.Random;

import org.junit.Test;

public class AdvancedCalculatorTest {
	Random r = new Random();
	AdvancedCalculator a = new AdvancedCalculator();
	
	@Test
	public void testSquareRoot() {
		
		//positive
		double value = r.nextDouble() * 10;
		double result = Math.sqrt(value);
		assertEquals(a.squareRoot(value), result, 0);
		
		//zero
		value = 0;
		result = Math.sqrt(value);
		assertEquals(a.squareRoot(value), result, 0);
		
		//negative
		value = r.nextDouble() * 10 -20;
		result = Math.sqrt(value);
		assertEquals(a.squareRoot(value), result, 0);
	}
	
	@Test
	public void testToThePowerOf() {
		
		//positive
		double firstArgument = r.nextDouble() * 10;
		double secondArgument = r.nextDouble() * 10;
		double result = Math.pow(firstArgument, secondArgument);
		assertEquals(a.toThePowerOf(firstArgument, secondArgument), result, 0);
		
		//zero
		firstArgument = 0;
		secondArgument = 0;
		result = Math.pow(firstArgument, secondArgument);
		assertEquals(a.toThePowerOf(firstArgument, secondArgument), result, 0);
		
		//negative
		firstArgument = r.nextDouble() * 10 - 20;
		secondArgument = r.nextDouble() * 10 - 20;
		result = Math.pow(firstArgument, secondArgument);
		assertEquals(a.toThePowerOf(firstArgument, secondArgument), result, 0);
		

	}
	
	@Test
	public void testAbsoluteValue() {
		
		//positive
		double value = r.nextDouble() * 10;
		double result = Math.abs(value);
		assertEquals(a.absoluteValue(value), result, 0);
		
		//zero
		value = 0;
		result = Math.abs(value);
		assertEquals(a.absoluteValue(value), result, 0);
		
		//negative
		value = r.nextDouble() * 10 -20;
		result = Math.abs(value);
		assertEquals(a.absoluteValue(value), result, 0);
	}
	
	@Test
	public void testPercentageOf() {
		
		//positive
		double percentage = r.nextDouble() * 10;
		double ofValue = r.nextDouble() * 10;
		double result = (percentage * ofValue) / 100;
		assertEquals(a.percentageOf(percentage, ofValue), result, 0);
		
		//zero
		percentage = 0;
		ofValue = 0;
		result = (percentage * ofValue) / 100;
		assertEquals(a.percentageOf(percentage, ofValue), result, 0);
		
		//negative
		percentage = r.nextDouble() * 10 - 20;
		ofValue = r.nextDouble() * 10 - 20;
		result = (percentage * ofValue) / 100;
		assertEquals(a.percentageOf(percentage, ofValue), result, 0);
		
		
	}
	@Test
	public void testCubeRoot() {
		
		//positive
		double value = r.nextDouble() * 10;
		double result = Math.cbrt(value);
		assertEquals(a.cubeRoot(value), result, 0);
		
		//zero
		value = 0;
		result = Math.cbrt(value);
		assertEquals(a.cubeRoot(value), result, 0);
		
		//negative
		value = r.nextDouble() * 10 -20;
		result = Math.cbrt(value);
		assertEquals(a.cubeRoot(value), result, 0);
	}

}
