package JavaSessions17.builderpattern;

public class TestAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		EcommerceApp user=new EcommerceApp();
//		user.login("ayesha.yusuf@gmail.com", "test123");
//		user.search("iphone");
//		user.addToCart("iphone");
//		here the methods are called one after the other

		
		//This is one whole scenario of the application
		
		//This is a method chaining
		//The below methods are equivalent in calling individual methods as above
		//Each an every method returns the current class object
		//The methods of the Ecomm app can be called wo further creating objects of the class
		//THis is called a builder pattern
		
		//User can create any kind of workflow
		//user need not write user.login(),user.search(),user,addToCart()
		//the methods can be called using method chaining
		//Another uc of this to generate builder pattern
		
		//Usecase 1
		//only 1 object is created referred by user reference and internally all the methods are called
		//login() will return the same class object
		//We are performing the scenario wo doing any testing(ie validation cannot be done
		EcommerceApp user=new EcommerceApp();
		user.login("ayesha.yusuf@gmail.com", "test123") //can't confirm that login has happened successfully
				.search("iphone") //can't confirm that search has happened successfully
					.addToCart("iphone") //can't confirm that addToCart has happened successfully
						.doPayment("ayesha@sbi") //can't confirm that doPayment has happened successfully
							.generateOrderId() 	//can't confirm that generateOrderId has happened successfully
								.logOut();	//can't confirm that logOut has happened successfully
		
		//Usecase 2
		user.login("ayesha.yusuf@gmail.com", "test123")
			.addToCart("iphone")
				.doPayment("test@icici")
					.generateOrderId()
						.logOut();
		
		//Usecase 3
		user.login()
			.addToCart("iphone")
				.logOut();
		
		
		//Usecase 4
		user.login("karu@gmail.com","test123")
			.search("shoes",5)
				.logOut();
		
		//Usecase 5
		user.login("ibu@gmail.com","test123")
				.logOut();
			
		System.out.println("Ending...");		
	}

}
