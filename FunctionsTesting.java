package algorithms;

import java.util.Scanner;

public class FunctionsTesting {

	static Scanner scn = new Scanner(System.in);

	public FunctionsTesting() {

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

//		char op = scn.next().charAt(0);

		int ans = sum1(n1, n2);

		if (n1 == (int) n1) {
			System.out.println(ans);

		}

		else if (n1 == (int) n1) {
			sum2(n1, n2);
		}

	}

	public static int sum1(int a, int b) {

		int ans = a + b;
		return ans;

	}

	public static void sum2(double a, double b) {

		double ans = a + b;
		System.out.println(ans);

	}

}