package lec10_java_conditional_statements;

/*
Conditional Statement:
Conditional Statements allow the program to behave differently based on condition. Example: if, else, else if, switch.
Regarding condition: First condition is if
Generally we don't use 2 if condition (code wise OK), rather we use if as first condition and else or else if as second condition. 
Generally the true statement is written at the end.
When we write else, no condition is necessary to write inside parentheses.
But if we wish to write a second condition , we have to use ‘else if’, not ‘else’. 
 */

public class CompareNumber06 {

	public static void main(String[] args) {
		int val1 = 45;
		
		if(val1 % 2 ==0) {
			System.out.println(val1+" is an even number");
		} else if(val1 % 2 ==1) {
			System.out.println(val1+" is an odd number");
		}
	}
}
