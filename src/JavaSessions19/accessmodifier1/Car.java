package JavaSessions19.accessmodifier1;

public class Car {

	String name;
	public String color;
	protected int price;
	private int licenseNumber;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1=new Car();
		c1.name="Audi";
		c1.color="Silver";
		c1.price=100000;
		c1.licenseNumber=12345678;
		//All the properties can be accessed within the same class
		
		//private int i=10
		//default int j=20;
		//protected int k=30;
		//public int l=40;
		
		//Access modifiers are allowed only for the class variables and not local variable
		
		//static int i=10; static local variables aren't allowed as static is defined at the class level and not locally
		
		final int i=10; //final local variable is allowed
		
	}
}
