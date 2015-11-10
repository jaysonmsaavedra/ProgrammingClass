package com.marithic.chapter10;

import java.util.*;

public class Exercise3 {

	static Scanner totalChange = new Scanner(System.in);

	static float dollar = 1.00F;
	static float quarter = 0.25F;
	static float dime = 0.10F;
	static float nickel = 0.05F;
	static float penny = .01F;

	public static void main(String[] args) {

		System.out.print("How much is the change? ");

		if (totalChange.hasNextFloat()) {

			float totalChangeInput = totalChange.nextFloat();

			int totalChangeInDollars = (int) ((totalChangeInput / dollar));
			int totalChangeInQuarters = (int) ((totalChangeInput % dollar) / quarter);
			int totalChangeInDimes = (int) ((totalChangeInput % dollar % quarter) / dime);
			int totalChangeInNickels = (int) ((totalChangeInput % dollar % quarter % dime) / nickel);
			int totalChangeInPennies = (int) ((totalChangeInput % dollar % quarter % dime % nickel) / penny);
			System.out.println("Your change in dollars is " + totalChangeInDollars);
			System.out.println("Your change in quarters is " + totalChangeInQuarters);
			System.out.println("Your change in dimes is " + totalChangeInDimes);
			System.out.println("Your change in nickels is " + totalChangeInNickels);
			System.out.println("Your change in pennies is " + totalChangeInPennies);
		} else {

			System.out.println("Please input the change in this format 12.34");

		}

	}

}
