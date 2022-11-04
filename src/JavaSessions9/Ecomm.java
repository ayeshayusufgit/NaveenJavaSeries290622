package JavaSessions9;

public class Ecomm {

	// This feature of method with the same name and different parameters is called
	// method overloading
	// within the same class, when u have number of methods:
	// 1. with the same name
	// 2. different number of parameters
	// 3. different types of parameters
	// 4. sequence of parameters should be different
	
	//Return never participates in the method overloading concept
	
	//Easier to debug or change the code for the developer

	public void login() {// 0 parameter
		System.out.println("Default Login");
	}

	/*
	 * Duplicate means same method name with same number of parameters Cannot have
	 * duplicate functions in java Even if the return type is different
	 * 
	 * public int login() { System.out.println("Default Login"); return 100; }
	 */

	// A function with the same name but different parameter is allowed in Java
	// There are many ways of logging in for customers
	public int login(String username, String password) { // 1 parameter
		System.out.println("Login with:" + username + ":" + password);
		return 100;
	}

	public void login(String username, int otp) { // 2 parameter
		System.out.println("Login with:" + username + ":" + otp);
	}

	public void login(int otp, String username) { // 2 parameter
		System.out.println("Login with:" + username + ":" + otp);
	}

	public void login(String username, String password, String otp) { // 3 parameters
		System.out.println("Login with:" + username + ":" + password + ":" + otp);
	}

	public void login(long ph, int otp) {
		System.out.println("Login with:" + ph + ":" + otp);
	}
	
	public void login(int otp,long ph) {
		System.out.println("Login with:" + ph + ":" + otp);
	}
	//this is not a good practice coz whatever function is to be done with the
	//previous function is done with the current aswell
	//the parameters are the same only the sequence differs
	
	
	//gives an error as the same type and sequence of parameters(signature)
	//even though the String username is renamed to un
	
	/*public void login(int otp,String un) {
		System.out.println("Login with:" + otp + ":" + un);
	}*/
	
	public void login(int otp,String username,double num) {
		System.out.println("Login with:" + username + ":" + otp+":"+num);
	}
	
	
	//feature name:search
	//filters:
	//1.name
	//2.name,price
	//3.seller,name,price
	public void search() {
		
	}
	
	public void search(String name) {
		
	}
	
	public void search(String name,int price) {
		
	}
	
	public void search(String name,int price,String seller) {
		
	}
	
	//payment
	public void doPayment(String cc,int otp) {
		
	}
	
	public void doPayment(String dc,int otp,String pwd) {
		
	}
	
	public void doPayment(long ph,int otp) {
		
	}
	
	public void doPayment(long ph,int otp,String upi) {
		
	}
	
	//Uber bookings
	public void booking(String st,String end) {
		
	}

	public void booking(String st,String end,String carType) {
		
	}
	
	public void booking(String st,String end,String carType,String couponCode) {
		
	}
	
	//if a parameter is not used in the function then that parameter 
	//should be removed from the function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ecomm ecom = new Ecomm();
		
		//The compiler decides while calling the login() which overloaded function to be invoked		
		ecom.login("admin","admin");
		
		ecom.booking("Koramangala", "Indiranagar");

	}

}
