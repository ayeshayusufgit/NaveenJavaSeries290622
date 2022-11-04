package JavaSessions16.exception_handling;

public class TryCatchBlock1_8b {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock1_8b obj=new TryCatchBlock1_8b();
		obj.name="Tom";
		//obj=null;
		
		try {
			System.out.println(obj.name);
			int i = 9 / 0;//results in Arithmetic Exception
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
			
		} catch (Exception e) {
			//Throwable is a super class of Exception and this also can be used to handle
			
			//The Throwable class is a super-super class of AE, so the exception is getting handled in the catch block
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
