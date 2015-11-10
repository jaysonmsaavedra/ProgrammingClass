package com.marithic.chapter29;

import java.util.Scanner;

public class Exercise1A {

	static Scanner userName = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(getName("first").trim() + " " + getName("last").trim());
	}

	public static String getName(String nameDecide) {
		System.out.print("What is your " + nameDecide + " name? ");
		String inputtedName = userName.nextLine();
		if (nameDecide == "last") {			
			return inputtedName.toUpperCase();
		} else {
			return inputtedName;
		}
	}
}
