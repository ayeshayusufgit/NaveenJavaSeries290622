package JavaSessions3;

public class IfElseConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20; // assignment operator does allocates a memory location a
		int b = 20;
		if (a > b) {
			System.out.println("a greater than b");
		} else {
			System.out.println("b greater than or equal to a");
		}

		if (a == b) {
			// this checks the value of a and b, comparision operator checks for the
			// equality of the values
			System.out.println("both are equal");
		}

		if (true) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		int number = 90; // the if else conditions should always use in variable and not true/false
							// directly

		if (number <= 100) {

			if (number >= 90) {
				System.out.println("GRADE A");
			}

			if (number >= 75) {
				System.out.println("GRADE B");
			}
		} else {
			System.out.println("Invalid number");
		}
		String browser = "firefox";
		if (browser.equals("chrome")) { // equals() is used for String comparison
			System.out.println("launch Chrome");
		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch Firefox");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("launch Safari");
//		}
//		if(browser.equals("ie")) {
//			System.out.println("launch IE");
//		}
//		else {
//			System.out.println("pls pass the right browser");
//		}
		if (browser.equals("firefox")) {
			System.out.println("launch Firefox");
		} else if (browser.equals("safari")) {
			System.out.println("launch Safari");
		} else if (browser.equals("ie")) {
			System.out.println("launch IE");
		} else {
			System.out.println("pls pass the right browser");
		}

	}

}
