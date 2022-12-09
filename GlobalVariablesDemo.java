package algorithms;

public class GlobalVariablesDemo {
	public static int val = 20; // defining global variable

	public static void main(String[] args) {

		int val = 40; // defining local variable

/////////////////////////////////////////////////////////////////////////

		System.out.println(GlobalVariablesDemo.val); // printing global variable

		System.out.println(val); // printing local variable

		int res = DemoScopes(val, GlobalVariablesDemo.val);
		System.out.println(res);

	}

	public static int DemoScopes(int one, int two) {
		int res = one + two;
		return res;

	}

}
