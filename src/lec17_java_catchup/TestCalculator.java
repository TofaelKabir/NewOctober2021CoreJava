package lec17_java_catchup;

public class TestCalculator {

	public static void main(String[] args) {
		ImplCalculator calculator = new ImplCalculator();
		CalculatorBluePrint calculatorBluePrint = new ImplCalculator();
		calculatorBluePrint.addition(5, 10);
	//	calculatorBluePrint.className();
		AbsCalculator absCalculator = new ImplCalculator();
		absCalculator.className();
	//	absCalculator.addition(5, 10);
		
		calculator.concreatClass();
		int result = calculator.addition(5, 111);
		System.out.println(result);
		result = calculator.multiplication(60, 200);//Reinitializing, resuing object
		System.out.println(result);
		result = calculator.substraction(20, 5);
		System.out.println(result);
		result = calculator.substraction(20, 100);
		System.out.println(result);
		result = calculator.substraction(20, 20);
		System.out.println(result);
		double result2 = calculator.division(111.0, 11.0);
		System.out.println(result2);
		calculator.className();
		AbsCalculator.aMethod();
		//calculator.aMethod();
		ImplCalculator.aMethod();
		CalculatorBluePrint.interfaceName();
		
		System.out.println("JVM Object reference "+calculator.hashCode());
		System.out.println(calculator.getClass().getName());
		calculator.toString();

		//calculatorBluePrint.interfaceName();
	}
}
