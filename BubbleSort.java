package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = takeInput();
		display(array);
		bubbleSort(array);

	}

	public static int[] takeInput() {

		System.out.println("size of array ?");
		int s1 = scn.nextInt();

		int arr[] = new int[s1]; // Input will allocate the size of array

		for (int i = 0; i < arr.length; i++) {
			System.out.println("value for " + i + " index");
			arr[i] = scn.nextInt();
		}
		return arr;

	}
	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i += 10) {

			System.out.println();
			System.out.println("Array = " + Arrays.toString(arr));

		}
	}
	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) { // n-1
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}
		display(arr);
	}

}