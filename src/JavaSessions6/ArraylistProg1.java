package JavaSessions6;

import java.util.ArrayList;

public class ArraylistProg1 {
	
	/*
	 * 1. Write a Java program to create a new array list, add some colors (string) and print out the collection

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> colorList=new ArrayList<String>();
		colorList.add("Pink");
		colorList.add("Yellow");
		colorList.add("Green");
		
		for(String color:colorList) {
			System.out.print(color+"->");
		}
	}

}
