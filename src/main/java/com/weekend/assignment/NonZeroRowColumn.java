package com.weekend.assignment;

import com.utility.Utility;

public class NonZeroRowColumn {

	public static void main(String[] args) {
		int size[] = sizeOfArray();
		int rows = size[0], columns = size[1], count = 0;
		int inputArray[][] = inputArray(rows, columns);

		System.out.println("press 0 : For no of Zero elements in the input Array");
		System.out.println("press 1 : For no of Non-Zero elements in the input Array");
		System.out.println("press 2 : For no of Non-Zero rows in the input Array");
		System.out.println("press 3 : For no of Non-Zero columns in the input Array");
		int option = Utility.readNumber();
		switch (option) {
		case 0:
			zeroElements(inputArray, rows, columns, count);
			break;
		case 1:
			nonZeroElements(inputArray, rows, columns, count);
			break;
		case 2:
			nonZeroRows(inputArray, rows, columns, count);
			break;
		case 3:
			nonZeroColumns(inputArray, rows, columns, count);
			break;
		default:
			System.out.println("please enter given numbers only... Run the program again..");

		}

	}

	private static void nonZeroColumns(int[][] inputArray, int rows, int columns, int count) {
		int nonZeroColumns = 0;

		for (int j = 0; j < columns; j++) {
			int temp = 0;
			for (int i = 0; i < rows; i++) {
				if (inputArray[i][j] != 0)
					temp++;
			}
			if (temp == rows)
				nonZeroColumns++;
		}
		System.out.println("Number of Non-Zero Columns in the input array is :" + nonZeroColumns);

	}

	private static void nonZeroRows(int[][] inputArray, int rows, int columns, int count) {
		int nonZeroRows = 0;
		for (int i = 0; i < rows; i++) {
			int temp = 0;
			for (int j = 0; j < columns; j++) {
				if (inputArray[i][j] != 0)
					temp++;
			}
			if (temp == columns)
				nonZeroRows++;
		}

		System.out.println("Number of Non-Zero Rows in the input array is :" + nonZeroRows);
	}

	private static void nonZeroElements(int[][] inputArray, int rows, int columns, int count) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (inputArray[i][j] != 0)
					count++;
			}
		}
		System.out.println("Number of Non-Zero Elements in the input array is :" + count);

	}

	private static void zeroElements(int[][] inputArray, int rows, int columns, int count) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (inputArray[i][j] == 0)
					count++;
			}
		}
		System.out.println("Number of Zero Elements in the input array is :" + count);
	}

	private static int[][] inputArray(int rows, int columns) {
		int array[][] = new int[rows][columns];
		System.out.println("please enter the elements into input array :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = Utility.readNumber();
			}
		}
		return array;
	}

	private static int[] sizeOfArray() {
		System.out.println("please enter the size of the array.....");
		System.out.println("Number of Rows :");
		int rows = Utility.readNumber();
		System.out.println("Number of Columns :");
		int columns = Utility.readNumber();
		int[] size = { rows, columns };
		return size;
	}

}
