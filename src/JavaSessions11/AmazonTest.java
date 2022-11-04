package JavaSessions11;

//Program 6
public class AmazonTest {

	//A good example of crud operations
	//Creating the login
	//Updating the login
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp=new LoginPage();
		
		//this will be for sign up
		lp.setUserName("admin@gmail.com");
		lp.setPassWord("admin123");
		
		//this will be for login
		lp.login(lp.getUserName(), lp.getPassWord());
		
		//this will be for resetting the password
		lp.setPassWord("admin567");
		lp.login(lp.getUserName(), lp.getPassWord());//the new password will be used
		
		LoginPage lp1=new LoginPage();
		lp1.login(lp1.getUserName(), lp1.getPassWord());
		//logging in with null username and null password
		
		//Each and every customer will have their own mobile app their own logins 
		//so an object for each customer will be created and not sharing objects
		//1000 customers are created,1000 laptops are created,
		//100 atm machines are created from the template
		//Each and every object is different having their own properties
		//This is encapsulation
		
		
		
		
		

	}

}
