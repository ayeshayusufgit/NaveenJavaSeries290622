package JavaSessions17.builderpattern;

public class UberApp {
	
	public UberApp login() {
		System.out.println("default login");
		return this;
	}

	public UberApp login(String username, String password) {
		System.out.println("login with:" + username + " and " + password);
		return this;
	}
	
	
	public UberApp search() {
		System.out.println("default car search");
		return this;
	}

	public UberApp search(String carType) {
		System.out.println("search with car type: " + carType);
		return this;
	}
	
	public UberApp enterJourneryDetails(String destn) {
		System.out.println("Default Journey");
		System.out.println("Journey from current location to destination"+destn);
		return this;
	}
	
	public UberApp enterJourneryDetails(String source,String destn) {
		System.out.println("Journey from: " + source+" destination"+destn);
		return this;
	}
	
	public UberApp selectCar(String carType) {
		System.out.println("Car of type: " + carType+" selected.");
		return this;
	}
	
	public UberApp startJourney() {
		System.out.println("Journey started.");
		return this;
	}
	
	public UberApp completeJourney() {
		System.out.println("Journey completed.");
		return this;
	}
}
