package JavaSessions16.exception_handling;

public class TryCatchBlock1_5 {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock1_5 obj=new TryCatchBlock1_5();
		obj.name="Tom";
		System.out.println(obj.name);
		//this will result in a Null Pointer Exception and will terminate the program
		//as its not getting handled and can be added in the try catch block

		try {
			//This will result in a NPE and since its not handled with the right 
			//exception the program gets terminated and no statements from here on 
			//gets executed
			
			int i = 9 / 3; //These lines are not resulting in an Exception
			System.out.println("Hi");//These lines are not resulting in an Exception
			System.out.println("Hi");//These lines are not resulting in an Exception
			System.out.println("Hi");//These lines are not resulting in an Exception
			
		} catch (ArithmeticException e) {
			//The catch block wont be executed as the above lines are not resulting in an AE but a NPE 
			
			System.out.println("Some exception is coming....");
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
