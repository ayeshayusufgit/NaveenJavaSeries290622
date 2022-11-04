package JavaSessions12;

//Program 1
public class Employee {

	String name;
	int id;
	int age;
	double salary;
	boolean isPerm;
	char gender;
	
	@Override
	public void finalize() {
		System.out.println("Inside finalize method->Employee class");
	}
	
	//constructor
	//The constructor name is the same name as that of the class name
	//A constructor cannot have any return type
	//The constructor can be overloaded and paramters can be passed to it
	//The respective constructor will be called when an object of the class is created
	
	//function may or maynot return a value but the constructor will never return a value
	//function name can be anything but the constructor name can only be the name of the class name
	//function will have the business logic or the feature logic(defines the feature), constructor will be helping to create the object
	//To call the function we need to create the object and use the obj ref but the constructor need not be called its triggered when an object of the class is created and the values are supplied(as per the constructor defined)
	
	
	
	public Employee() {//0 parameter or a default constructor
		System.out.println("Default Constructor");
	}
	
	public Employee(int a) {//1 parameter constructor
	System.out.println(a);
	}
	
	public Employee(String name,int id) {//1 parameter constructor
		this.name=name;
		this.id=id;
		}
	

	public Employee(String name,int id, int age) {//2 parameter constructor
		this.name=name;
		this.id=id;
		this.age=age;
		}
	
	public Employee(String name,boolean isPerm) {
		this.name=name;
		this.isPerm=isPerm;
	}
	
	public Employee(String name,int id, int age,double salary,boolean isPerm,char gender) {//2 parameter constructor
		this.name=name;
		this.id=id;
		this.age=age;
		this.salary=salary;
		this.isPerm=isPerm;
		this.gender=gender;
		}
}
