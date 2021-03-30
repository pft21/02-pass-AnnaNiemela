package _pass_AnnaNiemela.Calculator;

public class Main {

	public static void main(String[] args) {
		BasicCalculator b = new BasicCalculator();
		AdvancedCalculator a = new AdvancedCalculator();
		
		System.out.println(b.addition(2.0, 5.0));
		System.out.println(b.subtraction(5.0, 2.0));
		System.out.println(b.multiplication(2.0, 5.0));
		System.out.println(b.division(10.0, 5.0));
		
		System.out.println(a.squareRoot(16.0));
		System.out.println(a.squareRoot(16.0));
		System.out.println(a.absoluteValue(-100.0));
		System.out.println(a.percentageOf(50.0, 300.0));
		System.out.println(a.cubeRoot(64.0));
	}
}
