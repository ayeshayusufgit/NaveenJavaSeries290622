package JavaSessions15;

//The abstract methods coming from the Page class should be implemented in the LoginPage class 
//ow you get an error he type LoginPage must implement the inherited abstract method Page.title()

public class HomePage extends Page {

	@Override
	public void title() {
		System.out.println("HP--title");
		
	}

	@Override
	public void url() {
		System.out.println("HP--url");
		
	}
	
	@Override
	public void header() {
		System.out.println("HP--header");
	}
	
	public void logOut() {
		System.out.println("User is getting logged out!!!!");
	}

}
