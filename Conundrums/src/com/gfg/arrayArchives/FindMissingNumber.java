package com.gfg.arrayArchives;

public class FindMissingNumber {

	
	public static void main(String[] args) {
		
		int[] input={1,2,3,4,5,7};
		
		int n=input[input.length-1];
		int sumOfAlln=(n*(n+1))/2;
		
		int currentSum=0;
		for (int i = 0; i < input.length; i++) {
			currentSum=currentSum+input[i];
		}
		int missingNumber=sumOfAlln-currentSum;
		System.out.println("Missing no:"+missingNumber);
		
	}
}
