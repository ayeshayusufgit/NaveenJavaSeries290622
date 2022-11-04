package JavaSessions16.exception_handling;

public class ThrowsKeyword2 {
	
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
	
	//the main() is not handling the exception and the exception is thrown to jvm
	//as the jvm is calling the main()	
	
	//jvm will not handle the Exception but will print the lines resulting in the exception
	
	public static void main(String[] args) throws ArithmeticException{

		ThrowsKeyword2 obj=new ThrowsKeyword2();
		obj.m1();
		
		System.out.println("Bye");
		//Bye will not be executed thus proving that the jvm will not be handling the exception
		//If jvm was handling the exception then the exception would not be printed on the console
		//Nobody is handling the exception
		
	}

}
