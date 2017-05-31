package com.gfg.arrayArchives;

import java.util.HashMap;
import java.util.Map;

public class NumberOccuringOdd {

	public static void main(String[] args) {
		int[] input = { 2, 2,2, 3, 3, 5, 5, 3 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {
			if (map.containsKey(input[i])) {
				map.put(input[i], map.get(input[i]) + 1);
			} else {
				map.put(input[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 != 0) {
				System.out.println("Odd occurence is of number:" + entry.getKey());
			}
		}

	}
}
