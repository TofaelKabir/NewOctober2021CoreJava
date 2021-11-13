package lec17_java_catchup;

public interface CalculatorBluePrint extends NumberFormat{

	public abstract int addition(int a, int b);
	public abstract int substraction(int a, int b);
	public abstract int multiplication(int a, int b);
	public abstract double division(double a, double b);
	
	public static void interfaceName() {
		System.out.println("Calculator Interface");
	}
}
