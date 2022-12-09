package algorithms;

public class ArraysDemo {

	public static void main(String[] args) {

		int array[] = new int[5];

		array[0] = 0;
		array[1] = 10;
		array[2] = 20;
		array[3] = 30;
		array[4] = 40;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int val : array) {
			System.out.println(val);
		}

		
		
		
		System.out.println();
	}
}