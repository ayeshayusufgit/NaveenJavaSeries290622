package JavaSessions12;

//Program 4
public class MySystem {

	/*
	 * public MySystem() {
	 * 
	 * }
	 */

	// if the default constructor is made private from public

	private MySystem() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySystem m1=new MySystem();
		//the object of this class can be created even though the constructor is private
		//this restricts in creation of the object of the class from 
		
		//System system=new System(); There is a default constructor in the Systems class
		//but its private thus giving an exception when an object of the System class is created
		
		
	}

}
