package lec21_java_string_manipulation02;

public class UseOfStringBuilder {

	public static void main(String[] args) {
		// The StringBuilder append() method concatenates the given argument with this String.
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java"); // now original string is changed
		System.out.println(sb);
		
		// The StringBuilder insert() method inserts the given string with this string at the given position.
		sb.insert(5, "!");// now original string is changed
		System.out.println(sb);

		// The StringBuilder replace() method replaces the given string from the
		// specified beginIndex and endIndex.
		sb.replace(1, 3, "Java");
		System.out.println(sb);

		// The delete() method of StringBuilder class deletes the string from the
		// specified beginIndex to endIndex.
		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo

		// The reverse() method of StringBuilder class reverses the current string.
		sb.reverse();
		System.out.println(sb);// prints olleH

		// The capacity() method of StringBuilder class returns the current capacity of
		// the Builder. The default capacity of the Builder is 16.
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.capacity());// default 16
		sb2.append("Hello");
		System.out.println(sb2.capacity());// now 16
		sb2.append("Java is my favourite language");
		System.out.println(sb2.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

		// The ensureCapacity() method of StringBuilder class ensures that the given
		// capacity is the minimum to the current capacity.
		
		sb2.ensureCapacity(10);// now no change
		System.out.println(sb2.capacity());// now 34
		sb2.ensureCapacity(50);
		System.out.println(sb2.capacity()); // now (34*2)+2

	}

}
