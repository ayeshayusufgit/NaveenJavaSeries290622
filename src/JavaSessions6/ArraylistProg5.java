package JavaSessions6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistProg5 {

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

		System.out.println("Enter the index to be removed");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		alphaList.remove(index);
		
		System.out.println("\nUsing for-each loop\n");
		for (String alphabet : alphaList) {
			System.out.println(alphabet);
		}
	}
}
