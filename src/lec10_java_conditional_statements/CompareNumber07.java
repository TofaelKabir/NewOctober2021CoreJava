package lec10_java_conditional_statements;

/*
Conditional Statement:
Conditional Statements allow the program to behave differently based on condition. Example: if, else, else if, switch.
Regarding condition: First condition is if
Generally we don't use 2 if condition (code wise OK), rather we use if as first condition and else or else if as second condition. 
Generally the true statement is written at the end.
When we write else, no condition is necessary to write inside parentheses.
But if we wish to write a second condition , we have to use ‘else if’, not ‘else’. 

Java Logical Operators: Logical operators are used to determine the logic between variables or values

&&  Logical and operator (Returns true if both statements are true, x < 5 &&  x < 10)
||   Logical or operator (Returns true if one of the statements is true, x < 5 || x < 4)
  
 */

// logical or operator -- the example is not so unique, just see the logic (how does it work)
public class CompareNumber07 {

	public static void main(String[] args) {
		int val1 = 45;
		int val2 = 40;

		if (val1 % 2 == 0 && val1 < val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is shorter than " + val2);
		} else if (val1 % 2 == 1 && val1 < val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " is shorter than " + val2);
		} else if (val1 % 2 == 0 || val1 < val2) {
			System.out.println(val1 + " is an even number or " + val1 + " is shorter than " + val2);
		} else if (val1 % 2 == 1 || val1 < val2) {
			System.out.println(val1 + " is an odd number or " + val1 + " is shorter than " + val2);
		}
	}
}
