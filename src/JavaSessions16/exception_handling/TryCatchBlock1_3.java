package JavaSessions16.exception_handling;

public class TryCatchBlock1_3 {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0; 
			//results in an Arithmetic Exception due to which the below lines will never be executed
			//which gets handled in the catch block
			
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
		} catch (ArithmeticException e) {//The exception object need not be created, created by the jvm internally and thrown 
			
			System.out.println("Some exception is coming....");
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
