package JavaSessions6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistProg7 {

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
		
		ArrayList<String> revAlphaList = new ArrayList<String>();
		
		for(int i=alphaList.size()-1;i>=0;i--) {
			revAlphaList.add(alphaList.get(i));
		}
		
		System.out.println(alphaList);
		System.out.println(revAlphaList);
		
	}
}
