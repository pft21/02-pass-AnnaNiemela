package _pass_AnnaNiemela.Calculator;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	public double squareRoot(double value) {
		return Math.sqrt(value);
	}
	
	public double toThePowerOf(double firstArgument, double secondArgument) {
		return Math.pow(firstArgument, secondArgument);
	}
	
	public double absoluteValue(double value) {
		return Math.abs(value);
	}
	
	public double percentageOf(double percentage, double ofValue) { // i.e. how much is 50% of 300kr
		return (percentage * ofValue) / 100;
	}
	
	public double cubeRoot(double value) {
		return Math.cbrt(value);	
	}	
}
