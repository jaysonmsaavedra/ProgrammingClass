package com.marithic.chapter24;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise2 {

	static Scanner userInput = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.00");

	public static void main(String[] args) {
		System.out.println("Value: " + "$" + df.format(getTotal()));
	}

	public static float getTotal() {
		float P = getInt("initial deposit");
		float r = getInt("interest rate as a fraction");
		float n = getInt("number of times per year interest was calculated");
		float t = getInt("number of years it was in the account");
		float a = (1 + r / n);
		float b = n * t;

		return ((float) ((float) P * Math.pow(a, b)));
	}

	public static float getInt(String type) {
		System.out.print("What was the " + type + "? ");
		float value = userInput.nextFloat();
		return value;
	}

}
