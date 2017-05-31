package com.gfg.arrayArchives;

public class LargestContSumArray {
	
	public static void main(String[] args) {
		int[] input = {-2, -3, 4, -1, -2, 1, 5, -3};
		int max_so_far=0;
		int max_end=0;
		
		for (int i = 0; i < input.length; i++) {
			max_end=max_end+input[i];
			if(max_end<0)
				max_end=0;
			if(max_so_far<max_end)
				max_so_far=max_end;
		}
		System.out.println("largest contigious sum:"+max_so_far);
		
	}
}
