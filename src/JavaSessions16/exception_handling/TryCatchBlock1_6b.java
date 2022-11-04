package JavaSessions16.exception_handling;

public class TryCatchBlock1_6b {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock1_6b obj=new TryCatchBlock1_6b();
		obj.name="Tom";
		//obj=null;
		
		try {
			System.out.println(obj.name);//If the exception is coming due to NPE then it will not goto the next line which is also resulting in an AE			
			int i = 9 / 0;
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
		} catch (ArithmeticException e) {
			//This catch block wont be executed as only 1 Exception can be handled at a time 
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
