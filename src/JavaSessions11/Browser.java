package JavaSessions11;

//Program 7
//A proper example of Encapsulation
public class Browser {
	
	
	/*public void launchBrowser() {
		System.out.println("launch browser");
	}

	public void checkBrVersion() {
		System.out.println("Check BR version");
	}
	
	
	public void checkOSVersion() {
		System.out.println("Check OS version");
	}
	
	
	public void checkEnoughRAM() {
		System.out.println("Check enough RAM!");
	}*/
	
	//This is like opening the atm machine and giving it to the users
	//The user can still withdraw the cash, but the internal mechanism is visible now
	//The user is totally confused that which method has to be called as the end user is not technical all the time
	//the end user is a normal customer, he wont know how to use these methods 
	//checkBrVersion() or checkOSVersion() or checkEnoughRAM() etc as all are public
	//We need to correctly specify what methods need to to public and what private
	//and accordingly expose these methods to the external users
	
	
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkBrVersion();
		checkOSVersion();
		checkEnoughRAM();
		System.out.println("The browser is launched");
	}

	private void checkBrVersion() {
		System.out.println("Check BR version");//Very complex login thus not exposed to the user
	}
	
	
	private void checkOSVersion() {
		System.out.println("Check OS version");
	}
	
	
	private void checkEnoughRAM() {
		System.out.println("Check enough RAM!");
	}
	
	
}
