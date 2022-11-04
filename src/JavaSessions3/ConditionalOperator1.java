package JavaSessions3;

import java.util.Scanner;

public class ConditionalOperator1 {
	// 1. Take three numbers from the user and print the greatest number.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1 = sc.nextInt();

		System.out.println("Enter number2:");
		int num2 = sc.nextInt();

		System.out.println("Enter number3:");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest");
		}
		else {
			System.out.println(num3+" is the largest");
		}

	}

}
