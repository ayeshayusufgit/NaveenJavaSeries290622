package JavaSessions16.exception_handling;

public class TryCatchBlock1_6 {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock1_6 obj=new TryCatchBlock1_6();
		obj.name="Tom";
		obj=null;
		//System.out.println(obj.name);//needs to be handled with try/catch as it results in an Exception
		//if there a failure then the control wont go inside a try/catch block
		
		
		try {
			System.out.println(obj.name);//NPE , thus moved this statement inside try/catch block to be handled
			int i = 9 / 3;
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
			//A single try can have multiple catch blocks
		} catch (ArithmeticException e) {
			//The catch block wont be executed as the above lines are not resulting in an AE but a NPE
			System.out.println("AE exception is coming....");
			e.printStackTrace();
		}catch(NullPointerException e) {
			//This catch block will be executed as the NPE which is thrown by the JVM is caught by this catch block
			System.out.println("NPE exception is coming....");
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
	}
}
