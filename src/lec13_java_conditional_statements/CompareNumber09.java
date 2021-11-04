package lec13_java_conditional_statements;

import java.util.Scanner;

// Nested if else condition

public class CompareNumber09 {

	public static void main(String[] args) {
		System.out.println("Please put value here: ");
		Scanner scanner = new Scanner(System.in);

		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		if (val1 % 2 == 0) {
			if(val1<val2) {
				System.out.println(val1 + " is an even number and "+val1+" is less than "+ val2);
			} else if (val1>val2) {
				System.out.println(val1 + " is an even number and "+val1+" is greater than "+ val2);
			}

		}else if(val1 % 2 == 1){
			if(val1<val2) {
				System.out.println(val1 + " is an odd number and "+val1+" is less than "+ val2);
			} else if (val1>val2) {
				System.out.println(val1 + " is an odd number and "+val1+" is greater than "+ val2);
			}
		}
		scanner.close(); // formalities, but if you don't use, no change.

	}

}
