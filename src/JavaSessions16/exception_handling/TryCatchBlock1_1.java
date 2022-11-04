package JavaSessions16.exception_handling;

public class TryCatchBlock1_1 {
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		//int i=9/3;
		int i= 9/0;
		//This results in an Arithmetic exception(/ by 0) and the execution of the 
		//program is terminated from line 11.The execution of the program is halted
		//the execution stops from line 11, so this line needs to be handled so that
		//the following lines execution continues by the try/catch block
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		
	}

}
