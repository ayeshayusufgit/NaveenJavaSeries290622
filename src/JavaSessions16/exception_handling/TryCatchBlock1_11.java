package JavaSessions16.exception_handling;

public class TryCatchBlock1_11 {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock1_11 obj=new TryCatchBlock1_11();
		obj.name="Tom";
		//obj=null;
		
		try {
			System.out.println(obj.name);
			int i = 9 / 0;//results in Arithmetic Exception
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
			
		} catch (Error e) {//The Error will still be a bad practice, specific Error and Exceptions are preferred
			
			//Getting an Exception in the code of the try block and
			//handling it with the catch of type Error
			
			//The Exception will not be handled in the Program with
			//an Error class in the catch block and vice versa
			
			//But in the catch block can have Exception,Error,Throwable 
			//or the specific error or exception
			
			System.out.println("some exception is coming....");
			e.printStackTrace();
			}
//		catch(ArithmeticException e) {
//			System.out.println("some exception is coming....");
//			e.printStackTrace();
//		}catch(NullPointerException e) {
//			System.out.println("NPE exception is coming....");
//			e.printStackTrace();
//		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
	}
}
