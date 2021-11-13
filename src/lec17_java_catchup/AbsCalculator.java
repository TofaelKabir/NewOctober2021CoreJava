package lec17_java_catchup;

public abstract class AbsCalculator{

	public abstract int percentage(int a, int b);
	public abstract int remainder(int a, int b);
	
	public void className() {
		System.out.println(this.getClass().getName());
	}
	
	public static void aMethod() {
		System.out.println("This is a method");
	}
}
