package JavaSessions3;

import java.util.Scanner;

public class ConditionalOperator2 {
	// 2. Write a Java program to test a number is positive or negative.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 0;
		
		checkPositiveOrNegativeNumber(num);

	}

	
	static void checkPositiveOrNegativeNumber(double num) {
		if(num>0.0) {
			System.out.println(num+" is +ve");
		}else if(num<0.0) {
			System.out.println(num+" is -ve");
		}else {
			System.out.println(num+" is zero");
		}
	}
}
