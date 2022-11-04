package JavaSessions15;

//The abstract methods coming from the Page class should be implemented in the LoginPage class 
//ow you get an error he type LoginPage must implement the inherited abstract method Page.title()

public class LoginPage extends Page {

	//default constructor...hidden constructor
	public LoginPage() {
		System.out.println("LP--default const");
	}
	
	@Override
	public void title() {
		System.out.println("LP--title");
	}

	@Override
	public void url() {
		System.out.println("LP--url");
	}

	public void doLogin(String username, String password) {
		System.out.println("login with:" + username + " password:" + password);
	}

	public void doLogin(String username, String password, long ph) {
		System.out.println("login with:" + username + " password:" + password);
	}
	
	
}
