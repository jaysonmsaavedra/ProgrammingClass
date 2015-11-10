package com.marithic.chapter47;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
	static int[] data = { 3, 2, 5, 7, 9, 12, 97, 24, 54 };
	static List<Integer> evens;
	static List<Integer> odds;
	static int sumOfEvens;
	static int sumOfOdds;

	public static void main(String[] args) {
		finishExample();
	}

	public static List<Integer> getEvenOrOdds(int a) {
		List<Integer> evensOrOdds = new ArrayList<Integer>();

		for (int index = 0; index < data.length; index++) {
			if (data[index] % 2 == a) {
				evensOrOdds.add(data[index]);
			}
		}
		return evensOrOdds;
	}
	
	public static int getSum(List<Integer> b) {
		int sum = b.stream().mapToInt(Integer::intValue).sum();
		
		return sum;
	}
	
	public static void finishExample() {
		evens = getEvenOrOdds(0);
		odds = getEvenOrOdds(1);
		sumOfEvens = getSum(evens);
		sumOfOdds = getSum(odds);
		System.out.println(sumOfEvens);
		System.out.println(sumOfOdds);
	}
	
}
