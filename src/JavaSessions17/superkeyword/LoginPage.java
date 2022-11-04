package JavaSessions17.superkeyword;

public class LoginPage extends Page {
	int timeOut = 200;

	//When super is used within a constructor then its used with a parenthesis
	//When super is used within a method then parenthesis is not required(super.display)
	//when super is used to access a parent variable then parenthesis is still not used(super.timeOut)
	public LoginPage() {
		//System.out.println("Hi");The super() if not the first statement will give an error
		
		//super(10);
		super(10,20);//2 super statements will not be allowed in java, gives an error
		
		//Parameterized constructor of the Parent class will be called
		//super keyword decides which parent class constructor needs to be called
		
		//super();
		//depends on the parameters that are being passed from super()
		//so the superclass default constructor will be invoked as no parameters are being passed from super()
		//The Page class object need not be created to invoke the super class constructor
	}
	
	public void loginInfo() {
		System.out.println("Login info methods");
	
		//The super keyword in method can be used anywhere but in construct
		super.display();//super keyword used to access the superclass properties
		display();//child class display() will be called
	}
	
	@Override
	public void display() {
		System.out.println("Login Page--Display");
		super.display();//super keyword used to access the superclass properties
	}
	
	public void getTimeOut() {
		System.out.println(timeOut);
		//This will print the child class variable(property) timeOut
		
		System.out.println(super.timeOut);
		//This will print the parent class variable(property) timeOut
	}
}
