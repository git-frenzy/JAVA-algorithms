package algorithms;

public class CustomFuction1 {

	public static void main(String[] args) {

	// CALLING A FUNCTION

		int a = 0;
		int b = 0;

		int ans2 = valueReturn(a, b);
		System.out.println(ans2);
	}

	// CREATING A FUNCTION

	public static int valueReturn(int a, int b) {

		int ans = a + b;
		return ans;

	}

}
