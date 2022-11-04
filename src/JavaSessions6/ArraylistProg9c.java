package JavaSessions6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraylistProg9c {

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
		System.out.println("Before swapping" + alphaList);

		System.out.println("Enter the values to be swapped");
		Scanner sc = new Scanner(System.in);
		String startValue = sc.next().toUpperCase();
		String endValue = sc.next().toUpperCase();
		int index1 = alphaList.indexOf(startValue);
		int index2 = alphaList.indexOf(endValue);
		if(index1!=-1||index2!=-1) {
		alphaList.set(index1, alphaList.get(index2));
		alphaList.set(index2, startValue);
		System.out.println("After swapping" + alphaList);}
		else {
			System.out.println("Any one or both the values to be swapped does not exist");
		}

	}
}
