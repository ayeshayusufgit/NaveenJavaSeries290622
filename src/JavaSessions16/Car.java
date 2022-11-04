package JavaSessions16;

public class Car {
	String name;
	int price;
	String colour;
	//int wheels; 
	//whenever there is a value common to the class or all the object then
	//that value should be defined with static, as below
	static int wheels=4;
	//static variable can be used in
	//static can be used only for class variables and cannot be used locally
	
	//static class vars should be the common value for wheels for all the objects

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=10; // will not be part of the object
		//variable i, static variable cannot be defined locally coz they are 
		//class variables
		
		
		Car c1=new Car();
		c1.name="BMW";
		c1.price=60;
		c1.colour="red";
		//c1.wheels=4; removing wheels as its common and making it a static. 
		wheels=4;
		
		Car c2=new Car();
		c2.name="Audi";
		c2.price=70;
		c2.colour="blue";
		//c2.wheels=4;
		
		Car c3=new Car();
		c3.name="Honda";
		c3.price=15;
		c3.colour="black";
		//c3.wheels=4;
	
		System.out.println(c1.name+":"+c1.price+":"+c1.colour);
		//since the objects are associated with object specific values 
		//so can be accessed or assigned by their references
		
		//How to access static variables?
		//No need to create the object to access it
		//1.Within the same class, u can access them with the Classname  or directly
		System.out.println(Car.wheels); //will be giving 4
		//this is the best ways of accessing the static variable with the classname
		
		//2.so for static their is no reference thus can be accessed directly
		System.out.println(wheels);
		//System.out.println(name);
		//class variables always accessed with their reference c1.name ow error
		
		//3.Call object by reference
		//Gives a warning that static field Car.wheels should be accessed in a 
		//static way(Car.wheels or wheels), not a good way of accessing it
		//not a good practice
		System.out.println(c1.wheels);
		
		
		
		
	}

}
