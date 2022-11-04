package JavaSessions7;

public class User {

	//String name='Tom'; is a very bad practice as all the user names will be Tom
	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Values wrt to different objects will be taken
		User user1=new User();
		user1.name="Dhara";
		user1.age=25;
		user1.city="Pune";
		
		User user2=new User();
		user2.name="Prashant";
		user2.age=30;
		user2.city="Delhi";
		
		User user3=new User();
		user3.name="Neha";
		user3.age=25;
		user3.city="Bangalore";

		System.out.println(user1.name+user1.age+user1.city);
		System.out.println(user2.name+user2.age+user2.city);
		System.out.println(user3.name+user3.age+user3.city);
		
		user1=user2;
		System.out.println(user1.name+user1.age+user1.city);
		System.out.println(user2.name+user2.age+user2.city);
		System.out.println(user3.name+user3.age+user3.city);
		
		user2=user3;
		System.out.println(user1.name+user1.age+user1.city);
		System.out.println(user2.name+user2.age+user2.city);
		System.out.println(user3.name+user3.age+user3.city);
		
		user3=user1;
		System.out.println(user1.name+user1.age+user1.city);
		System.out.println(user2.name+user2.age+user2.city);
		System.out.println(user3.name+user3.age+user3.city);
		
		//object reference
		//no reference - true
		//one reference - true
		//multiple reference - true
		//the type of reference to an object should be the same
		//only User u1 can point to a User object and not to Employee object
			
		
	}
}
