package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = takeInput();
		display(array);

		System.out.println(binarySearch(array));

	}
	public static int[] takeInput() {

		System.out.println("size of array ?");
		int s1 = scn.nextInt();

		int arr[] = new int[s1]; // Input will allocate the size of array

		for (int i = 0; i < arr.length; i++) {
			System.out.println("value for " + i + " index");
			arr[i] = scn.nextInt();
		}

		Arrays.sort(arr);
		return arr;

	}
	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i += 10) {

			System.out.println();
			System.out.println("Array = " + Arrays.toString(arr));

		}
	}
	public static int binarySearch(int[] arr) {

		System.out.println();
		System.out.println("Enter search N");
		
		int s = scn.nextInt();
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (arr[mid] < s) {
				lo = mid + 1;
			} else if (arr[mid] > s) {
				hi = mid - 1;
			} else {

				return mid;
			}

		}return -1;
	}

}