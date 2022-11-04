package JavaSessions14.inheritance;

//BMW is a child class of Car
//BMW is a sub class of Car
//Car is a super class of BMW
//Car is a parent of BMW

//public class BMW extends Car,Truck{
//This is the diamond problem(multiple inheritance with classes) and it cannot be implemented in java	

public class BMW extends Car {

	// BMW doesn't want to have the start() of Car as its a premium brand will have
	// an autostart(doesn't want to have the regular outdated start of the Car
	// class)
	
	// This is not the inherited method but the override method
	// start() is defined in the parent class the exact same is defined in the child
	// class aswell

	// Method OVerriding vs Method Overloading
	// Overriding happens between parent n child but Overloading happens within the
	// same class
	
	// private methods cannot be overriden
	// overriding happens only incase of inheritance

	// When you have a method in the parent class and the same method in the child
	// class with:
	// the same name
	// the same number of parameters(0 parameters in the parent class in the start()
	// and the same in the child class)
	// i.e. same signature->return type n the parameters in the method n access
	// modifier should be same
	// Method Overriding is a type of Polymorphism->Poly(Many)+Morphism(Forms)
	// What type of Polymorphism?It is Runtime Polymorphism(Dynamic Polymorphism)

	// Method Overloading:Only within the same class(No concept of parent n child)
	// Method Overloading is a type of Polymorphism
	// What type of Polymorphism?It is Compile Time Polymorphism(Static
	// Polymorphism)

	@Override // Its not mandatory to use but a good practice
	// if this annotation doesn't give any error then the method is successfully
	// override
	public void start() {
		System.out.println("BMW---start");
	}

	public void autoParking() {
		System.out.println("BMW---Autoparking");
	}
	
	//@Override overriding a static method is not allowed
	public static void drive() {
		System.out.println("Car -- drive");
	}
}
