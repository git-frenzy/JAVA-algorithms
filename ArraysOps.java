package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOps {

	static Scanner scn = new Scanner(System.in); // GLOBAL SCANNNER

	public static void main(String[] args) {

		int[] array = takeInput();

		display(array);

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

		for (int i = 0; i < arr.length; i += 2) {
			
			System.out.println();

			System.out.println(Arrays.toString(arr));

//			System.out.println(arr[i]);
		}

	}

}