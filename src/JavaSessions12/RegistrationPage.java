package JavaSessions12;

//Assignment Program
public class RegistrationPage {
	
	//All the fields are mandatory, initialize all the fields using a constructor
	//setters to change the existing values
	//show all the personal details which have been entered
	
	//Design a Registration page class
	//Define these variables fname, lname, email, telephone, password, new password
	//Create a constructor for all the fields which are mandatory
	//Maintain the getter and setters for the above fields
	//Create a testRegistration class to test this
	//Create the object by passing some values, then update the values
	
	//https://demo.opencart.com/index.php?route=account/register&language=en-gb
	//page class
	//private class variables:fn,ln,email id ......
	//constructor with all the fields
	//getters and setters
	
	//test class
	//create the object of the RegistrationPage class
	//get come values using getters
	//update the email id,phone number as its changed
	//get the above values using getters
	
	private String fName;
	private String lName;
	private String email;
	private String password;
	
	
	public RegistrationPage(String fName, String lName, String email, String password) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
	}

	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}