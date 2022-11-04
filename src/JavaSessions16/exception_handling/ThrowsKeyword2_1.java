package JavaSessions16.exception_handling;

public class ThrowsKeyword2_1 {
	
	//Exception cannot be handled through throws keyword

	//m1() has to handle the exception thrown by m2()
	//m1() is also not handling the exception, so throwing it to the main() 
	public void m1() {
		System.out.println("m1");
		m2();
	}
	
	//m2() has to handle that exception, thrown by m3()
	//m2() is also not handling the exception, so throwing it to m1()
	public void m2() throws ArithmeticException{
		System.out.println("m2");
		m3();
	}
	
	//This method is throwing AE thus the throws keyword can be used
	//m3() doesn't want to handle the exception so just throwing it to the 
	//method calling it ie m2()
	public void m3() throws ArithmeticException{
	
		System.out.println("m3");
		int i=9/0;
	}
	
	//The main() has to handle the exception thrown by m1()
	//main() is not handling the exception
	//the try/catch should be used to handle exceptions not throws
	public static void main(String[] args) {

		ThrowsKeyword2_1 obj=new ThrowsKeyword2_1();
		obj.m1();
		
		System.out.println("Bye");
		//Nobody is handling the exception
		//This is a bad practice as the exception is being passed from 1 method to another
		//The exception is not handled
		
	}

}
