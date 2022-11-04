package JavaSessions19.accessmodifier2;

import JavaSessions19.accessmodifier1.Car;

public class Audi extends Car{

	//Since Car class is coming from a different package an error comes
	//To resolve this the Car class needs to be imported from package "accessmodifier1"
	
	//only import a class ie "Car" class which is used in the Audi
	
	//multiple import for the same class is not allowed(like below)
	//import JavaSessions.Car
	//import AccessModifier1.Car
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.color="Green";//public
		//private,default and protected cannot be accessed into another package
		//of the parent class Car but only color which is a public attribute
		
		Audi a=new Audi();
		//only public and protected variables get inherited into the child class Audi 
		//which is in another package "accessmodifier2" 
		a.price=123456;//protected
		a.color="Pink"; //public
		
		//Only public and protected attributes of the Car class can be accessed
		
		
		
	}

}
