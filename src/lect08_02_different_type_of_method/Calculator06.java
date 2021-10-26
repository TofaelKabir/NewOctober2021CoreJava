package lect08_02_different_type_of_method;

public class Calculator06 {
	
	public int addition(int a, String b) { // local variable
		int total1 = a+Integer.parseInt(b);
		System.out.println("Addition of a and b is: "+total1);
		return total1;
	}
	
	public int subtraction(int c, double d) {
		int total2 = c-(int)d;
		System.out.println("Subtraction of a and b is: "+total2);
		return total2;
	}
	
}

// Formula to convert String to int:
// Integer.parseInt(b)