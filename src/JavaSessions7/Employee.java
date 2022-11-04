package JavaSessions7;

public class Employee {

	// A blueprint of the Employee class
	//Class vars
	String name;
	int age;
	char gender;
	String city;
	double salary;
	boolean isPerm;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// emp1->object ref name
		// RHS ->new Employee(); is the object
		// Employee ->class/type of t1
		// non primitve datatype
		// An object of type Employee is created by the new keyword
		
		Employee emp1 = new Employee();
		emp1.name = "Tom";
		emp1.gender='F';
		emp1.age = 25;
		emp1.salary = 12.33;
		emp1.isPerm = true;
		System.out.println(" Emp name= " + emp1.name + " Age= " + emp1.age + " Salary= " + emp1.salary + " Is Permanent"
				+ emp1.isPerm);
		Employee emp2 = new Employee();
		System.out.println(" Emp name= " + emp2.name + " Age= " + emp2.age +" Gender="+emp2.gender +" Salary= " + emp2.salary + " Is Permanent="
				+ emp2.isPerm);
	}
}
