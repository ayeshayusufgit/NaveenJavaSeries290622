package JavaSessions16;

//interface to interface inheritance extends keyword is used
//A class can implement n number of interfaces(no limit to the number of interfaces)

public interface USMedicalAssc extends WHO{
//public interface USMedicalAssc extends WHO,UN{
//the type UN cannot be a superinterface of USMedicalAssc; a superinterface must be an interface
	
	
	public int min_fee=100;//constant
	
	//Cannot have any method body
	//only have method prototype,abstract methods(non static)
	//All the prototype methods in the interface are always non static
	
	//no method body, only method declaration
	//interface cannot have the business logic

	
	public void physioServices();
	
	public void cardioServices();
	
	public void oncologyServices();
	
	public void emergencyServices();
	//this method is also there is the other interfaces IndianMedicalAssc and UKMedicalAssc
	//as we have no control	on the UK and Indian Medical Associations
	
	//There can be a duplication of methods coming from various interfaces ex "emergencyServices"
	//but it can be overridden in the implementing class only once
	
	//public static void emergencyServices();
	//this cannot be allowed as static methods cannot be overridden
	
	//after jdk 1.8:
	//1.you can have static methods with the body:
	//and cannot be overriden
	public static void billing() {
		System.out.println("US Medical -- billing");
	}
	
	
	//2.can have default method with method body(non static)
	default void medInsurance() {
		System.out.println("US Medical -- insurance");
	}
	//No limit to the addition of default methods in the interface
	
	//THe above medInsurance() can be overridden in the child class implementing this method 
	//but with public access specifier
	
	//default method it to provide some default behavior to the interface 
	
}
