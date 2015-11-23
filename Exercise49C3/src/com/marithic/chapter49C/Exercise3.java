package com.marithic.chapter49C;

import java.util.Arrays;

public class Exercise3 {
	
	public static void main(String[] args) {
		int[][] data = { {3, 2, 5},
                		 {1, 4, 4, 8, 13},
                		 {9, 1, 0, 2},
                		 {0, 2, 6, 3, -1, -8} };
	
		int index = 0;
		int temp[] = new int[data[index].length];
		
		for (int row = 0; row < data[0].length; row++) {			
			for (int col = 0; col < data[row].length; col++) {
					temp[col] += data[col][row];
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
