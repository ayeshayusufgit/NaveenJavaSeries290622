package JavaSessions12;

//Program 2
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Everytime an object is created all its field needs to be initialized
		//Every Employee object has its own data
		//If 100 objects are created then 100x5 fields need to be initialized
		
		Employee e1=new Employee();
		//the default constructor will be called as we are not passing anything while creating the object
		
		e1.name="Poornima";
		e1.age=25;
		e1.id=100;
		e1.isPerm=true;
		e1.gender='f';
		
		
		Employee e2=new Employee(1);
		//The parameterized constructor will be called as we are passing an argument while creating the object
		//n number of constructors can be created with different parameters
		//Constructors can be overloaded
		
		Employee e3=new Employee("Tom",201);
		//2 properties will be passed to the employee constructor with 2 parameters
		//and the initialization happens to the class variables in the Employee class
		
		System.out.println(e3.name+" "+e3.age+" "+e3.id+" "+e3.isPerm+" "+e3.gender);
		//The properties that are initialized are only 2 ie name n id other values are initialized with the default values
		
		Employee e4=new Employee("Peter",202,30,13.44,true,'m');
		System.out.println(e4.isPerm);//to check if the employee is permanent or not
		
		Users u1=new Users("Naveen","Bangalore");
		Users u2=new Users("Tom",100,"NY");
		Users u3=new Users("Rahul",102,true,"Pune");
		//Users u4=new Users(); only the constructors defined in the Users class can be triggered
		//no default constructor was not defined thus giving an exception
		//the object of the class also wont be created
		
		//ref u1,u2 and u3 can be used to invoke the functions within the Employee class
		
		//MySystem m1=new MySystem();//the object of this is created due to the default constructor as its public
		
		//MySystem m1=new MySystem();//the object of this will not be created due to the default constructor being private
		//The constructor is not visible exception is thrown
		
		
		
		
		
		
		
	}

}
