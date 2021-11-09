package lec15_java_oop_inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		MountSinai mountSinai = new MountSinai();
		mountSinai.mountSinaiInfo();
		
		Employee employee = new Employee();
		employee.empInfo();
		employee.mountSinaiInfo();
		
		
		

	}

}
