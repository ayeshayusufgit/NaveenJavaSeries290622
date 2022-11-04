package JavaSessions16.exception_handling;

public class TryCatchBlock1_10 {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock1_10 obj=new TryCatchBlock1_10();
		obj.name="Tom";
		//obj=null;
		
		try {
			System.out.println(obj.name);
			int i = 9 / 0;//results in Arithmetic Exception
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
			
		} catch (Object e) {
			//Object class is a superclass of Throwable but results in an CTE
			//"No exception of type Object can be thrown; an exception type must be a subclass of Throwable"
			//Cannot be used in the catch block
			
			//Why Object can't be used in the catch block?(interview question)
			//1.catch block is not designed with the Object parameter
			//2.Only till Throwable class can be used with the catch block
			//3.Or the specific exception which is got while running the program
			//4.using e.printStackTrace() cannot be access as not apart of Object but there till the Throwable class
			//5.We cannot access the child class method from the parent class reference
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
