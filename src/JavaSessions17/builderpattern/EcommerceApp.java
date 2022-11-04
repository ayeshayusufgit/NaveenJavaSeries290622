package JavaSessions17.builderpattern;

public class EcommerceApp {

	public EcommerceApp login() {
		System.out.println("default login");
		
		//return new EcommerceApp(); 
		//this is not preferred as everytime a new object is created to avoid this
		//"this" keyword is used
		
		return this;
		// this method returns the current class object
	}

	public EcommerceApp login(String username, String password) {
		System.out.println("login with:" + username + " and " + password);
		//THe validation can be here but again its the violation of the Page Object Model
		//As per the POM validation cannot be written in the Page class methods
		//The test class using testng should have the validations
		return this;
	}

	public EcommerceApp search() {
		System.out.println("default search");
		return this;
	}

	public EcommerceApp search(String productName) {
		System.out.println("search for the product: " + productName);
		return this;
	}

	public EcommerceApp search(String productName, int rating) {
		System.out.println("search for the product: " + productName + ":" + rating);
		return this;
	}

	public EcommerceApp addToCart(String productName) {
		System.out.println("add to cart: " + productName);
		return this;
	}

	public EcommerceApp doPayment(String upi) {
		System.out.println("do payment via upi: " + upi);
		return this;
	}

	public EcommerceApp doPayment(String cc, int cvv) {
		System.out.println("do payment via cc: " + cc + " cvv:" + cvv);
		return this;
	}

	public EcommerceApp doPayment(String cc, int cvv, int otp) {
		System.out.println("do payment via cc: " + cc + " cvv:" + cvv + "otp:" + otp);
		return this;
	}

	public EcommerceApp generateOrderId() {
		System.out.println("order id is: " + 123456);
		return this;
	}

	public EcommerceApp logOut() {
		System.out.println("log out");
		return this;
	}
}
