package JavaSessions6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistProg4 {

	/*
	 * 5. Write a Java program to remove the third element from a array list. 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alphaList = new ArrayList<String>();
		alphaList.add("A");
		alphaList.add("B");
		alphaList.add("C");
		alphaList.add("D");
		alphaList.add("E");

		System.out.println("Enter the value to be replaced");
		Scanner sc = new Scanner(System.in);
		String actualValue = sc.next().toUpperCase();
		int index = alphaList.indexOf(actualValue);
		if (index != -1) {
			System.out.println("Enter the value after replacing");
			String expectedValue = sc.next().toUpperCase();
			System.out.println(alphaList.set(index, expectedValue));
		} else {
			System.out.println("This value doesnt exist");
		}

		System.out.println("\nUsing for-each loop\n");
		for (String alphabet : alphaList) {
			System.out.println(alphabet);
		}
	}
}
