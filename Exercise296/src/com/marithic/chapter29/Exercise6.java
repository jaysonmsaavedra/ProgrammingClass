package com.marithic.chapter29;

import java.util.Scanner;

public class Exercise6 {
	static Scanner userInput = new Scanner(System.in);
	static String userPassword;

	public static void main(String[] args) {
		userPassword = getPassword();
		checkLength();
		checkUpperCasing();
		checkLowerCasing();
		if (hasInteger() != true) {
			System.err.println("Password doesn't contain at least one digit.");
		}
	}

	public static String getPassword() {
		System.out.print("Enter your password: ");
		String password = userInput.nextLine();
		return password;
	}

	public static void checkLength() {
		if (userPassword.length() <= 7) {
			System.err.println("Password must be at least 7 characters long");
		}
	}

	public static void checkUpperCasing() {
		if (!userPassword.matches(".*[A-Z].*")) {
			System.err.println("Password doesn't contain at least one uppercase letter.");
		}
	}

	public static void checkLowerCasing() {
		if (!userPassword.matches(".*[a-z].*")) {
			System.err.println("Password doesn't contain at least one lowercase letter.");
		}
	}

	public static boolean hasInteger() {
		boolean k = false;
		for (char ch : userPassword.toCharArray()) {
			if (Character.isDigit(ch)) {
				k = true;
				break;
			}
		}
		return k;
	}
}
