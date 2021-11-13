package lec17_java_catchup;

public class ImplCalculator extends AbsCalculator implements CalculatorBluePrint{

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int substraction(int a, int b) {
		int result = 0;
		if(a > b) {
			result = a - b;
		}else if (b > a){
			result = b - a;
		}
		return result;
	}

	@Override
	public int multiplication(int a, int b) {
		return a*b;
	}

	@Override
	public double division(double a, double b) {
		double result = 0.0;
		result = a/b;
		return result;
	}

	@Override
	public int percentage(int a, int b) {
		return 0;
	}

	@Override
	public int remainder(int a, int b) {
		return 0;
	}
	
	public void concreatClass() {
		System.out.println("Concreate class");
	}
	
	
}
