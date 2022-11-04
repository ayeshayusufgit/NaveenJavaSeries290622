package JavaSessions19.accessmodifier2;

import JavaSessions19.accessmodifier1.Car;

public class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.color="Brown";//public
		//Only the public attribute "color" can be accessed from Car class
		
		//Bike t=new Bike(); not required as Truck class has nothing related to Car

	}

}
