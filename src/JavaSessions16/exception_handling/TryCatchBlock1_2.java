package JavaSessions16.exception_handling;

public class TryCatchBlock1_2 {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0; //results in an Arithmetic Exception 
		} catch (ArithmeticException e) {//handled in the catch block
			//catch block is used to report/log the exception
			System.out.println("Some exception is coming....");//prints this on the screen
			e.printStackTrace();//Prints the stacktrace or complete info about the exception
		}
		System.out.println("B");
		//this gets printed as the exception is handled by try/catch block
		//the programs continues its execution
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
