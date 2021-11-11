package lec16_java_oop_abstraction;

// A regular class
// A regular class can inherit only one regular class or one abstract class by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword


public class Toyota extends FlyingCar implements Car, Drone{
	// method is implemented inside class, not declared
	public void toyotaInfo() {
		System.out.println("This method is from Toyota class");
	}

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carryingpassenger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carryingGoods() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lightWeight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autoPilot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canFloat() {
		// TODO Auto-generated method stub
		
	}

}
