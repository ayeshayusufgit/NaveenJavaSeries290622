package JavaSessions12;

//Program 5
public class Customer {
	private String name;
	private int age;
	private String comp;
	
	//In a registration form when the user submits wo entering the name,age,comp
	//a blank entry is created in the database so to prevent enter the mandatory fields
	//and then submit the form, this can be done by using constructors and initializing
	//only the mandatory fields
	
	//Object can be created w/o any values
	public Customer() {
		System.out.println("Default Constructor");
	}
	
	//Constructor helps to initialize the object created 
	public Customer(String name, int age, String comp) {
		this.name = name;
		this.age = age;
		this.comp = comp;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	//features/methods:
	public String getCustomerInfo() {
		return name+" "+" "+age+" "+comp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
