package JavaSessions6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistProg6 {

	/*
	 * 6. Write a Java program to search an element in a array list.
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

		System.out.println("Enter the element to be searched");
		Scanner sc = new Scanner(System.in);
		String element= sc.next();
		int index=alphaList.indexOf(element);
		
		if(index!=-1) {
			System.out.println("The element "+element+" is found!");
		}else {
			System.out.println("The element "+element+" is not found!");
		}
		
		System.out.println("\nUsing for-each loop\n");
		for (String alphabet : alphaList) {
			System.out.println(alphabet);
		}
	}
}
