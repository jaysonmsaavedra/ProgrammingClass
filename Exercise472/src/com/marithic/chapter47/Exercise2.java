package com.marithic.chapter47;

public class Exercise2 {

	static int[] data = { 3, 1, 5, 12, 4, 12, -3, 8, -2 };
	static int largestInt;
	static int secondLargestInt;

	public static void main(String[] args) {
		largestInt = getLargeNumber();
		System.out.println("The largest number is: " + largestInt);
		secondLargestInt = getSecondLargeNumber();
		System.out.println("The second largest number is: " + secondLargestInt);
		
	}

	public static int getLargeNumber() {
		int largeNumber = 0;
		for (int index = 0; index < data.length; index++) {
			if (data[index] > largeNumber) {
				largeNumber = data[index];
			}
		}
		return largeNumber;
	}

	public static int getSecondLargeNumber() {
		int secondLargeNumber = 0;
		for (int index = 0; index < data.length; index++) {
			if (data[index] > secondLargeNumber && data[index] != largestInt) {
				secondLargeNumber = data[index];
			}
		}
		return secondLargeNumber;
	}
}
