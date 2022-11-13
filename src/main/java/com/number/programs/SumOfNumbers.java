//package com.number.programs;
//
//import com.utility.Utility;
//
//public class SumOfNumbers {
//
//	public static void main(String[] args) {
//		int menu = menu();
//		if (menu >= 0 && menu < 4) {
//			int n = lastnumber();
//			sumOfNumbers(menu, n);
//		} else
//			System.out.println("Please Run the program again and select menu accordingly...");
//
//	}
//
//	private static void sumOfNumbers(int menu, int n) {
//		int sum = 0, m;
//		if (menu == 0) {
//			m = n;
//			sum = m * (m + 1) / 2;
//		}
//		if (menu == 1) {
//			m = (n + 1) / 2;
//			sum = m * m;
//		}
//
//		if (menu == 2) {
//			m = (n + 1) / 2;
//			sum = m * m + m;
//		}
//
//		System.out.println(sum);
//	}
//
//	private static int lastnumber() {
//		System.out.println("please enter the last number");
//		int n = Utility.readNumber();
//		return n;
//	}
//
//	private static int menu() {
//		System.out.println("press 0: To get sum of numbers");
//		System.out.println("press 1: To get sum of Odd numbers");
//		System.out.println("press 2: To get sum of Even numbers");
//		int menu = Utility.readNumber();
//		return menu;
//	}
//
//}
