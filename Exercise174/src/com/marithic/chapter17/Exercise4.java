package com.marithic.chapter17;

import java.util.Scanner;

public class Exercise4 {

	static Scanner userInput = new Scanner(System.in);

	static int numberOfStars;
	static String stars = "*";

	public static void main(String[] args) {

		getNumberOfStars();
		loopThroughStars();
	}

	public static int getNumberOfStars() {
		System.out.print("How many stars do you want to start with? ");
		return numberOfStars = userInput.nextInt();

	}

	public static void loopThroughStars() {
		for (int i = numberOfStars; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
