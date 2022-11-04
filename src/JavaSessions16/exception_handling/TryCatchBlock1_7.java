package JavaSessions16.exception_handling;

public class TryCatchBlock1_7 {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock1_7 obj=new TryCatchBlock1_7();
		obj.name="Tom";
		obj=null;
		
		try {
			System.out.println(obj.name);//NPE
			int i = 9 / 3;
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
			
		} catch (Exception e) {
			//The Exception class is a super class of NPE, so the exception is getting handled in the catch block
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
		
		//THe exception which is coming is handled by the catch but a user wont know the exact exception
		//Thats why catch blocks to handle separate exceptions are preferred for ease of debugging
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
	}
}
