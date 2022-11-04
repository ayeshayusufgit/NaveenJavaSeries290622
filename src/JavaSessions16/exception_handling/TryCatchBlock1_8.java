package JavaSessions16.exception_handling;

public class TryCatchBlock1_8 {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock1_8 obj=new TryCatchBlock1_8();
		obj.name="Tom";
		//obj=null;
		
		try {
			System.out.println(obj.name);
			int i = 9 / 0;//results in Arithmetic Exception
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
			
		} catch (Exception e) {
			//This is not a good practice as we will know not which exception is being handled
			//there should be separate catch blocks for different exceptions like ArithmeticException an NullPointerException
			//or any xyz exception,separate catch blocks should be created
			
			//The Exception class is a super class of AE, so the exception is getting handled in the catch block
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
