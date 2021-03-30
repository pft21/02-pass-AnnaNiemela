package _pass_AnnaNiemela.Calculator;

public class BasicCalculator implements BasicOperations {
	
	public double addition(double firstValue, double secondValue) {
		double result = firstValue + secondValue;
		return result;
	}
	
	public double subtraction(double firstValue, double secondValue) {
		double result = firstValue - secondValue;
		return result;
	}
	
	public double multiplication(double firstValue, double secondValue) {
		double result = firstValue * secondValue;
		return result;
	}
	
	public double division(double firstValue, double secondValue) {
		double result = firstValue / secondValue;
		if (secondValue == 0) {
			System.out.println("You can not divide by zero.");
			return -0.123456789;
		} else {
			return result;
		}
	}
}
