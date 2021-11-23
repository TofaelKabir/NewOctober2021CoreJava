package lec20_java_string_manipulation01;

public class UseOfString02 {

	public static void main(String[] args) {
		String s1 = "My name is John. ";
		String s2 = "My name is John. ";
		String s3 = "my name is john. ";
		String s4 = "MY NAME IS JOHN. ";
		
		// To compare Strings and return a boolean value
		// Returns 'true' if the given object represents a String equivalent to this string, false otherwise
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s3.equals(s4)); // how that can be solved? one way below -
		System.out.println(s3.toUpperCase().equals(s4));
		System.out.println(s4.toLowerCase().equals(s3));
		
		// Two strings are considered equal ignoring case if they are of the same length 
		// and corresponding characters in the two strings are equal ignoring case.
		System.out.println(s3.equals(s4)); // how that can be solved, second way below--
		System.out.println(s3.equalsIgnoreCase(s4));
		
		// The java string trim() method eliminates leading and trailing spaces. 
		// To avoid white space: trim() -- (remove any leading and trailing whitespace) 
		String s5 = "          HelloWorld.  ";
		System.out.println("\nAfter trimming: " + s5.trim());
		
		// can't remove white space from center
		String s6 = "    Hello    World!    ";
		System.out.println("\nAfter trimming: " + s6.trim());
		
		// The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		// To replace we use replace() method
		// Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		String s7 = "Good morning";
		System.out.println("\nAfter replacing: " + s7.replace('m', 'M') );
		
		// replace() can't trim
		String s8 = "      GooD Morning      ";
		System.out.println("\nAfter replacing: " + s8.replace('D', 'd') );
		
		String s9 = "      Good MoRning      ";
		System.out.println("\nAfter triming and replacing: " + s9.trim().replace('R', 'r') );
		System.out.println("\nIf the above methods are used, now the value of String is: " + s9);
		
		System.out.println("\nAfter triming and replacing: " + s5.trim().replace('.', '!') );
		
		String s10 = "Hello! Let's learn together";
		System.out.println("\nAfter replacing a word: " + s10.replace("Hello!", "Welcome to Java.") );
		
		String dateOfToday = "11/22/2021"; // very much used
		System.out.println("\nAfter replacing: " + dateOfToday.replace('/', '-') );
		
		
		
		
		
		
		
		
		
		

	}

}
