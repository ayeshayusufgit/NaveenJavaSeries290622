package JavaSessions16.exception_handling;

public class ThrowsKeyword2_3 {

	public void m1() {
		System.out.println("m1");
		m2();
	}

	// m2 is the consumer of m3, so m2() has to handle the exception
	public void m2() {
		System.out.println("m2");
		try {
			m3();
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
	}

	// m3() is the producer/dev is not handling the exception
	// m3() will throw the exception
	// now its the consumers responsibility to handle the exception
	public void m3() throws ArithmeticException {

		System.out.println("m3");
		int i = 9 / 0;
	}

	// The exception has to be handled in the producer level
	// or the consumer level or the line in which the exception happens
	// THe exception shouldn't be thrown from 1 method to another

	public static void main(String[] args) {

		ThrowsKeyword2_3 obj = new ThrowsKeyword2_3();
		try {
			// This is a bad practice, the exception should be handled in the line it occurs 
			//ie in m3() the exception should be handled
			// or throws from m3() and handled in m2()
			obj.m1();
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		System.out.println("Bye");

	}

}
