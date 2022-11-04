package JavaSessions19.accessmodifier1;

public class BMW extends Car{
	
	//BMW is in the same package "accessmodifier1" and a subclass of Car
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.name="BMW 520"; //default
		c.price=123; //protected
		c.color="Red"; //public
		//private attribute "licenseNumber" not accessible 
		
		
		BMW b=new BMW();
		b.name="BMW 720"; //default
		b.price=567;	//protected
		b.color="Silver";	//public
		//private attribute "licenseNumber" not accessible
		
		//All the attributes of the child class can be accessed except for the private one
		//Same rule will be applied on the methods aswell
	}
}
