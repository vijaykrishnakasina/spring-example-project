package com.array.programs;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		System.out.println("please enter the size of the 1D Array");
		int array1[] = inputArray();
		copyArray(array1);
	}

	private static void copyArray(int array1[]) {
		int array2[] = new int[array1.length];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
		}
		System.out.print("The Elements of new array is: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}

	private static int[] inputArray() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("please enter the Elements into array");
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		return array;
	}
}
