package lec15_java_oop_inheritance;

// Employee is a child class and MountSinai is a Parent class
public class Employee extends MountSinai {
	
	public String empName;
	public int empId;
	public char sex;
	public boolean fullTimeEmp;
	
	// default constructor
	public Employee() {
		System.out.println("This is a default constructor from Employee class");
	}

	// parameterized constructor
	public Employee(String empName, int empId, char sex, boolean fullTimeEmp) {
		this.empName = empName;
		this.empId = empId;
		this.sex = sex;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and Full time employee? : " + fullTimeEmp);
		
	}
	
	// void type or no return method or non parameterized method
	public void empInfo() {
		System.out.println("This is a void method from employee class");
	}
	
	// parameterized method
	public void info(String empName, int empId, char sex, boolean fullTimeEmp) {
		this.empName = empName;
		this.empId = empId;
		this.sex = sex;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and Full time employee? : " + fullTimeEmp);
		
	}
	
	
	
	

}
