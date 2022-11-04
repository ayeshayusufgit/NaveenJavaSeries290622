package JavaSessions10;

public class Customer {
	String name;
	String id;
	static String city = "Bangalore";// All the customers are from blore
	//static city for a vaccine portal of blore static city will be used
	static String modeOfPayment = "CC";// only CC mode of payment is available
	

	public void getInfo() {
		System.out.println("Get Info!!!");
	}

	public static void sendMail() {
		System.out.println("Send Mail!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object never stores any static variable or static method
		Customer cust=new Customer();
		//How to call static methods?
		//1.call directly:
		sendMail();
		cust.getInfo();// non static methods can be accessed using the object.methodname()
		
		//2. using class name
		Customer.sendMail();
		
		//3. using object reference
		cust.sendMail(); // can also be accessed with a warning
	
		
	}

}
