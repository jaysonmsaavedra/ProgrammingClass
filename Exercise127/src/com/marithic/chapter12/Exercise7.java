package com.marithic.chapter12;

import java.util.Scanner;

public class Exercise7 {
	static Scanner userInput = new Scanner(System.in);
	static int dayBorn;
	static int daysAlive;
	static int monthsAlive;
	static int yearsAlive;

	static int daysAliveValue;
	static int monthsAliveValue;
	static int yearsAliveValue;
	static int totalSecondsAlive;
	
	public static void main(String[] args) {
		yearsAlive = timeMethod("years");
		monthsAlive = timeMethod("months");
		daysAlive = timeMethod("days");
		monthsAliveValue = (int) daysInMonthsCalculator();
		dayAliveCalculator();
	}

	public static int timeMethod(String timeUnit) {
		int timeUnitValue = 0;
		String timeUnitString = null;
		boolean isValid = false;
		do {
			if (timeUnit == "months") {
				System.out.print("What is the number of the month were you born in? ");
			} else if (timeUnit == "days") {
				System.out.print("What day were you born on? ");
			} else if (timeUnit == "years") {
				System.out.print("How old are you? ");
			}
			timeUnitString = userInput.nextLine();
			timeUnitValue = Integer.parseInt(timeUnitString);
			if (timeUnit == "years") {
				isValid = timeUnitValue >= 1 && timeUnitValue <= 200;
			} else if (timeUnit == "months") {
				isValid = timeUnitValue >= 1 && timeUnitValue <= 12;
			} else if (timeUnit == "days") {
				isValid = timeUnitValue >= 1 && timeUnitValue <= 31;
			}
		} while (!isValid);
		return timeUnitValue;
	}

	public static float daysInMonthsCalculator() {
		int unitValue1 = 0;
		if (monthsAlive == 1) {
			unitValue1 = 31 - daysAlive;
		} else if (monthsAlive % 2 == 0 && monthsAlive > 3) {
			unitValue1 = (31 + 28 + ((monthsAlive -2)/2 * (31 + 30))) - daysAlive;
		}
		return unitValue1;

	}

	public static void dayAliveCalculator() {
		int totalDaysAlive = monthsAliveValue + (yearsAlive * 365);
		totalSecondsAlive = totalDaysAlive * 24 * 60 * 60;
		System.out.println("You are " + totalSecondsAlive + " seconds old");
	}
}
