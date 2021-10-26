package lect08_02_different_type_of_method;

public class Calculator05 {
	// no global variable here
	// return type parameterized method
	public int addition(int a, int b) { // local variable
		int total1 = a+b;
		System.out.println("Addition of a and b is: "+total1);
		return total1;
	}
	
	// return type parameterized method
	public int subtraction(int a, int b) {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
		return total2;
	}
	
}
