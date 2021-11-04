package lec13_java_conditional_statements;

// high level code, no need to study now, but if you see the code somewhere you can recongnize by this

public class CompareNumber10 {

	public static void main(String[] args) {
		int age = 20;
		if (age<18) {
			System.out.println("You can't vote");
		} else {
			System.out.println("You can vote");
		}

		// Short-hand if else
		// There is also a short-hand if else, which is known as the ternary operator 
		// because it consists of three operands. It can be used to replace multiple lines of code with a single line. It is often used to replace simple if else statements
		
		String outcome= (age<18)? "You can't vote" : "You can vote";
		System.out.println(outcome);
		
	}

}
