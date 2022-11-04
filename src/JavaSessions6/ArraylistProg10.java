package JavaSessions6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistProg10 {

	/*
	 * 10. Write a Java program to empty an array list.
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
		
		System.out.println(alphaList);
		alphaList.clear();
		System.out.println(alphaList);

	}
}
