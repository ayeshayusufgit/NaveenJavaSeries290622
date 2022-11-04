package JavaSessions16.exception_handling;

public class TryCatchBlock1_6c {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock1_6c obj=new TryCatchBlock1_6c();
		obj.name="Tom";
		//obj=null;
		
		try {
			System.out.println(obj.name);//No NPE
			int i = 9 / 3; //No AE
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
			//none of the catch blocks will be executed as there is no Exception in the above lines
		} catch (ArithmeticException e) {
			System.out.println("AE exception is coming....");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("NPE exception is coming....");
			e.printStackTrace();
		}
		//It is a good practice to maintain multiple catch blocks
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
	}
}
