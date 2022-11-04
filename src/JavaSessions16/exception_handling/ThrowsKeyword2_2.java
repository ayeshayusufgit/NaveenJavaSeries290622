package JavaSessions16.exception_handling;

public class ThrowsKeyword2_2 {

	//The throws from all the methods can be removed
	public void m1() {
		System.out.println("m1");
		m2();
	}

	public void m2() {
		System.out.println("m2");
		m3();
	}

	public void m3() {
		System.out.println("m3");
		//The AE is handled by the try/catch block in m3()
		//The throws can be removed
		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ThrowsKeyword2_2 obj = new ThrowsKeyword2_2();
		obj.m1();

		System.out.println("Bye");

	}

}
