package JavaSessions4;

public class LoopsAssignment5 {
	/*
	 * 5. Write a program in Java to print 1 to 10 using while loop but quit if
	 * multiple of 7 is encountered
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10) {
			if (i % 7 == 0) {
				break;
			}
			System.out.println(i++);
		}
	}

}
