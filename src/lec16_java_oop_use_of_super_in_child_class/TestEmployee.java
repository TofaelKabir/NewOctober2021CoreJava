package lec16_java_oop_use_of_super_in_child_class;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("----------------- default constructor initialized ------------------");
		Employee employee = new Employee();
		
		System.out.println("\n-------------------- parameterized constructor initialized ----------------------------------------\n");
		Employee employee01 = new Employee("Tofael", 483, 'M', false); // the value called argument
		
		System.out.println("\n--------------- void type method initialized --------------------------------------\n");
		employee01.empInfo01();
		
		System.out.println("\n--------------- void type parameterized method initialized --------------------------------------\n");
		employee01.empInfo02("Sharkar", 228145, 'M', true);
		
		
		System.out.println("\n----------------- default constructor initialized -----------------------------------------\n");
		MountSinai mountSinai = new MountSinai();
		
		System.out.println("\n-------------------- parameterized constructor initialized -------------------------");
		MountSinai mountSinai01 = new MountSinai("Manhattan", 20);
		
		System.out.println("\n--------------- void type method initialized ---------------------------");
		mountSinai01.mountSinaiInfo01();
		
		System.out.println("\n--------------- void type parameterized method initialized -------------------");
		mountSinai01.mountSinaiInfo02("Queens", 19);
		

	}

}
