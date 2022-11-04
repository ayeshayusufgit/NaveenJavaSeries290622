package JavaSessions13.inheritance;

public class Car extends Vehicle{
	
	//The Car class methods gets inherited to its sub-classes
	
	@Override//Overridden method from the Vehicle class
	public void start() {
		System.out.println("Start");
	}
	
	public void stop() {
		System.out.println("Stop");
	}
	
	public void refuel() {
		System.out.println("Refuel");
	}
}
