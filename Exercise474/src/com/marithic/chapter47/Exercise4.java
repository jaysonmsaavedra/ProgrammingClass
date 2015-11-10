package com.marithic.chapter47;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

	static int[] data = {1,2,3,4,5,6,7,6,8,9,10,11,12,13,14};
	
	public static void main(String[] args) {
		
		System.out.println(reverseAndRewrite());
	}

	public static List<Integer> reverseAndRewrite() {
		List<Integer> reverseData = new ArrayList<Integer>();
		
		for (int counter=data.length - 1; counter > 0; counter--) {
			reverseData.add(counter);
		}
		
		return reverseData;
	}
	
}

