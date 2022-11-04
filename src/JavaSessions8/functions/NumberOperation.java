package JavaSessions8.functions;

import java.util.Scanner;

public class NumberOperation {

	public static void doSum(double a, double b) {
		System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
	}

	public static void doProduct(double a, double b) {
		System.out.println("The product of " + a + " and " + b + " is " + (a * b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1:");
		double num1 = sc.nextDouble();
		System.out.println("Enter number2:");
		double num2 = sc.nextDouble();
		doSum(num1, num2);
		doProduct(num1, num2);
	}
}
