package JavaSessions14.inheritance;

public  class Car extends Vehicle{
//public final class Car extends Vehicle{ final class can never be extended gives error
	//The Car class methods gets inherited to its sub-classes
	
	//final class - cannot be a parent
	//final method - cannot be overridden
	
	public final void logo() {
		//All the pages in the application should have the same logo thats why
		//cannot be overridden and thus final
	}
	
	
	@Override//Overridden method from the Vehicle class
	public void start() {
	//public final void start() { cannot be overriden and gives an error in the BMW start() 
		System.out.println("Start");
	}
	
	public void stop() {
		System.out.println("Stop");
	}
	
	public void refuel() {
		System.out.println("Refuel");
	}
	
	//static methods can be added but not overriden
	/*public static void drive() {
		System.out.println("Car -- drive");
	}*/
}
