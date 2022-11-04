package JavaSessions11;

public class TestBlock_1 {

	static {
		System.out.println("Static Block");
	}
	
	public static void test() {
		System.out.println("Test");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is the main()");
		test();

	}

}
