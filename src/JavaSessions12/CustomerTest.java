package JavaSessions12;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer("Tom", 30, "IBM");
		//parameterized constructor is triggered when the object is created
		//constructor is helping to construct the values for the class variables
		//The name,age or city cannot be accessed directly as they are private members
		//But it can be accessed via getters
		
		System.out.println(c1.getName()); //getters are used to retrieve the values
		System.out.println(c1.getAge());
		System.out.println(c1.getComp());
		
		//THe setters function exactly as the constructors
		//But it also helps in the updating of the values of the objects
		
		c1.setAge(33);
		c1.setComp("MS");
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getComp());
		//The comp is updated with MS and age with 33
		
		Customer c2=new Customer(); //The default constructor will get triggered and not initialization will be done
		c2.setName("Poornima"); //Since the default constructor doesnt do any initialization setter are being used
		c2.setAge(35);
		c2.setComp("Google");
		
		System.out.println(c2.getComp());
	}

}
