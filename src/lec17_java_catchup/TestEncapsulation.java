package lec17_java_catchup;

public class TestEncapsulation {

	public static void main(String[] args) {
		EncapsulationClass encap = new EncapsulationClass("Dead of House","Thriller", 90, 4.5f);
		System.out.println(encap.getMediaType());
		System.out.println(encap.getTitle());
		
		int hour = 22;
		
		do {
			hour--;
			System.out.println(hour);
		}
		while(hour > 16);
	}
}