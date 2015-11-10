package com.marithic.chapter47;

public class Exercise3 {

	static int[] data = { 3, 1, 5, 7, 4, 12, -3, 8, -2 };

	public static void main(String[] args) {
		System.out.println(closestToZero());
	}

	public static int closestToZero() {
		int closeToZero = Math.abs(data[0]);

		for (int index = 0; index < data.length; index++) {
			int newCloseToZero = Math.abs(data[index]);
			if (newCloseToZero < closeToZero) {
				closeToZero = data[index];
			}
		}

		return closeToZero;
	}

}
