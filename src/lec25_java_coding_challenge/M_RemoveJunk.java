package lec25_java_coding_challenge;

public class M_RemoveJunk {

	public static void main(String[] args) {
		String s = "hello%&^&()";
		// ^a-zA-Z0-9 = called regular expression or regex
		// ^ is called carat
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		String s1 = "*&^%$java";
		String s2 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);

	}

}
