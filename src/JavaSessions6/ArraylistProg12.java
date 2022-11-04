package JavaSessions6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistProg12 {

	/*
	 * 12. Write a Java program to print all the elements of a ArrayList using the
	 * position of the elements
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

		for (int i = 0; i < alphaList.size(); i++) {
			System.out.println(alphaList.get(i));
		}

	}
}
