package com.marithic.chapter47;

public class Exercise4 {

	static int[] data = {1,2,3,4,5,6,7,6,8,9,10,11,12,13,14};
	
	public static void main(String[] args) {
		
		for (int datum: reverseAndRewrite()) {
			System.out.print(datum + ",");
		}
	}

	public static int[] reverseAndRewrite() {
		int[] reverseData = new int[data.length];
		
		for (int counter=data.length - 1; counter >= 0; counter--) {
			reverseData[(reverseData.length - 1) - counter] = data[counter];
		}
		
		return reverseData;
	}
	
}

