package _pass_AnnaNiemela.Calculator;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
	
	/* public double value = 0;
	public double firstArgument = 0;
	public double secondArgument = 0;
	public double percentage = 0;
	public double ofValue = 0;
	*/

	public double squareRoot(double value) {
		return Math.sqrt(value);
	}
	
	public double toThePowerOf(double firstArgument, double secondArgument) {
		return Math.pow(firstArgument, secondArgument);
	}
	
	public double absoluteValue(double value) {
		return Math.abs(value);
	}
	
	public double percentageOf(double percentage, double ofValue) {
		return (percentage * ofValue) / 100;
	}
	
	public double cubeRoot(double value) {
		return Math.cbrt(value);	
	}
	
}
