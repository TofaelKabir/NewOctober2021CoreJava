package lec12_java_control_statements;

public class Use_of_nested_for_loop {

	public static void main(String[] args) {
		System.out.println("\n---------- nested loop int type----------\n");
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=5; j++) {
				System.out.println(j+i);
			}			
		}
		
		System.out.println("\n---------- nested loop float type----------\n");
		// as float type is used , we can get decimal for that
		for (float i = 1; i <=2; i++) {
			for (float j = 0; j <= 10; j++) {
				System.out.println(j/i);
			}
		}
		
		

	}

}

