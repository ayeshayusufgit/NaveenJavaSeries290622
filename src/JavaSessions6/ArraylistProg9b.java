package JavaSessions6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraylistProg9b {

	/*
	 * 9. Write a Java program of swap two elements in an array list.
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
		System.out.println("Before swapping"+alphaList);
		
		System.out.println("Enter the indexes for which swapping needs to be done( 0 to "+alphaList.size()+" )");
		Scanner sc = new Scanner(System.in);
		int startIndex= sc.nextInt();
		int endIndex= sc.nextInt();
		
		Collections.swap(alphaList, startIndex, endIndex);
		
		System.out.println("After swapping"+alphaList);

	}
}
