package JavaSessions19.accessmodifier1;

public class Truck {
	//Truck is a class in the same package "accessmodifier1" but not a subclass of Car class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Car();
		c.name="Audi";	 //default
		c.price=123456;	 //protected
		c.color="Black"; //public
		//private attribute "licenseNumber" cannot be accessed in Truck class
		
		//Truck t=new Truck(); not required as Truck class has nothing related to Car
		
	}

}
