package JavaSessions6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistProg8 {

	/*
	 * 7. Write a Java program to reverse elements in a array list
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
		
		
		System.out.println("Enter the range for the sublist( 0 to "+alphaList.size()+" )");
		Scanner sc = new Scanner(System.in);
		int startIndex= sc.nextInt();
		int endIndex= sc.nextInt();

		List<String> subList = alphaList.subList(startIndex, endIndex);

		System.out.println(alphaList);
		System.out.println(subList);

	}
}
