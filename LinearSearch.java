package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = takeInput();

		display(array);

		System.out.println();

		System.out.println("Search index " + linearSearch(array));
	}

	public static int[] takeInput() {
		System.out.print("Size of array = ");
		int s1 = scn.nextInt();

		int arr[] = new int[s1]; // Input will allocate the size of array

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Value for " + i + " index = ");
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i += 5) {

			System.out.println();

			System.out.println("Array = " + Arrays.toString(arr));
		}
	}

	public static int linearSearch(int[] arr) {

		System.out.print("Enter search INT ");
		int s2 = scn.nextInt();
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == s2) {
				return i;

			}
		}
		return -1;
	}

}
