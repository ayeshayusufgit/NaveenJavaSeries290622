package JavaSessions6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistProg3 {

	/*
	 * 2. Write a Java program to insert an element into the array list at the first
	 * and last positions.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> colourList = new ArrayList<String>();
		colourList.add("Pink");
		colourList.add("Yellow");
		colourList.add("Green");

		colourList.add(0, "Black");
		colourList.add(colourList.size(), "Grey");
		
		Scanner sc = new Scanner(System.in);
		String element = sc.next();
		
		System.out.println("\nUsing for-each loop\n");		
	      for (String colour : colourList)
	      { 		      
	           System.out.println(colour); 		
	      }
	}

}
