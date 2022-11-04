package JavaSessions16.exception_handling;

public class TryCatchBlock1_12 {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock1_12 obj=new TryCatchBlock1_12();
		obj.name="Tom";
		//obj=null;
		
		try {
			System.out.println(obj.name);
			int i = 9 / 0;//results in Arithmetic Exception
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
			
			//Errors and Exceptions can be handled using the catch block 
			
		} 
//		catch (Error e) {
//			System.out.println("Some exceptions are coming...");
//			e.printStackTrace();
//		}
		catch(ArithmeticException e) {//This is a good programming practice
			
			System.out.println("AE exception is coming....");
			e.printStackTrace();
			
		}catch(NullPointerException e) {
			
			System.out.println("NPE exception is coming....");
			e.printStackTrace();
			
		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
	}
}
