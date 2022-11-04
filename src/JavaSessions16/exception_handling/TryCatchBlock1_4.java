package JavaSessions16.exception_handling;

public class TryCatchBlock1_4 {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 3; 
			
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
			//These lines are not resulting in an Exception
		} catch (ArithmeticException e) {
			//The catch block wont be executed as the above lines are not resulting in an exception 
			
			System.out.println("Some exception is coming....");
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
