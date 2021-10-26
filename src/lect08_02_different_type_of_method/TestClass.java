package lect08_02_different_type_of_method;

public class TestClass {

	public static void main(String[] args) {
		Calculator01 cal1 = new Calculator01();
		cal1.addition();
		cal1.subtraction();		
		
		System.out.println("\n-------------------------------\n");		
		Calculator02 cal2 = new Calculator02();
		cal2.addition();
		cal2.subtraction();
		
		System.out.println("\n-------------------------------\n");
		Calculator03 cal3 = new Calculator03();
		cal3.multiplication();
		
		System.out.println("\n-------------------------------\n");
		Calculator04 cal4 = new Calculator04();
		cal4.division();
		
		System.out.println("\n-------------------------------\n");
		Calculator05 cal5 = new Calculator05();
		cal5.addition(44, 23); // we put the argument
		cal5.addition(77, 21);
		cal5.subtraction(33, 6);
		cal5.subtraction(55, 7);
		
		System.out.println("\n-------------------------------\n");
		Calculator06 cal6 = new Calculator06();
		cal6.addition(56, "7");
		cal6.subtraction(34, 12.74658364);

	}

}
