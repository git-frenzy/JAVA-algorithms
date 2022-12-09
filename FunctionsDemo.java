package algorithms;

import java.util.Scanner;

public class FunctionsDemo {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("hello");

		addition();

		System.out.println("bye");

		additionParams(5, 10);
		additionParams(10, 20);

///////////////////////////////////////////////////////////////////////////////

		
		System.out.println("a");
		double a = scn.nextInt();
		System.out.println("b");
		double b = scn.nextInt();

		double sum2 = additionReturn(a, b);
		System.out.println(sum2);

	}

	public static double additionReturn(double a, double b) {

		double sum1 = a + b;

		if (sum1 >= 100) {
			return sum1;

		} else {
			return 2 * sum1;
		}

	}

///////////////////////////////////////////////////////////////////////////////

	public static void additionParams(int a, int b) {

		int sum = a + b;
		System.out.println(sum);

	}

	// Function definition
	public static void addition() {

		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println(c);

	}

}
