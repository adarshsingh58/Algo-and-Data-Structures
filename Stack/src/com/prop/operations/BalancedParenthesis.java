package com.prop.operations;

import java.util.Scanner;

import com.prep.Stack.StackChar;

public class BalancedParenthesis {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] inputChar = input.toCharArray();
		StackChar stackChar = new StackChar(input.length());
		for (int i = 0; i < inputChar.length; i++) {

			if (inputChar[i] == '{' || inputChar[i] == '[' || inputChar[i] == '(') {
				stackChar.push(inputChar[i]);
			} else if (inputChar[i] == '}' || inputChar[i] == ']' || inputChar[i] == ')') {
				char poppedElement = stackChar.pop();
				if (inputChar[i] == '}') {
					if (poppedElement != '{')
						System.out.println("} mismatch");
				} else if (inputChar[i] == ']') {
					if (poppedElement != '[')
						System.out.println("] mismatch");
				} else if (inputChar[i] == ')') {
					if (poppedElement != '(')
						System.out.println(") mismatch");
				}
			}
		}
		
		if(stackChar.getTop()!=-1)
		{
			System.out.println(" mismatch");
		}
	}
}
