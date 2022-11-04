package JavaSessions8.functions;

import java.util.Scanner;

public class AreaOfCircle {

	public static void calculateCircumference(int radius) {
		System.out.println("The circumference of the circle of radius "+radius+" is"+2*(22/7)*radius);
	}
	
	public static void calculateArea(int radius) {
		System.out.println("The area of the circle of radius "+radius+" is"+(22/7)*radius*radius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the radius of the circle:");
		Scanner sc=new Scanner(System.in);
		int r = sc.nextInt();
		calculateCircumference(r);
		calculateArea(r);

	}

}
